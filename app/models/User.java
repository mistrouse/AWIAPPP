package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import play.api.libs.Codecs;

import javax.persistence.*;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class User extends Model {


    public static Model.Finder<Long, User> find = new Model.Finder<Long,User>(User.class);


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;


    String name;

    @Column(unique=true)
    String email;


    String password;

    /**
     * Role of the User.
     * 0=eleve
     * 1=prof
     * 2=Admin
     */
    int role;

    @OneToMany(mappedBy="autheur")
    @JsonBackReference
    List<Message> messagesPostes;

    @ManyToMany(mappedBy = "users")
    @JsonManagedReference
    List<Groupe> groupes;

    public User(Long id, String name, String email,  String password, int role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Message> getMessagesPostes() {return messagesPostes;}

    public int getRole() {
        return role;
    }

    public List<Groupe> getGroupes() { return groupes;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = Codecs.sha1(password);
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setMessagesPostes(List<Message> messages) {this.messagesPostes = messages;}

    public void setGroupes(List<Groupe> groups) {this.groupes = groups;}

    public static User findByPassword(String email, String password) {
        return User.find.where().eq("email", email).eq("password", password).findUnique();
    }

    public void fetchGroups() {
        this.groupes = Groupe.find.where().eq("users.id", this.id).findList();
    }
}