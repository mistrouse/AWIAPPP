package models;

import com.avaje.ebean.Model;
import play.api.libs.Codecs;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groupe extends Model {

    public static Model.Finder<Long, Groupe> find = new Model.Finder<Long, Groupe>(Groupe.class);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;


    String name;

    @OneToMany(mappedBy = "groupe")
    List<Message> messages;

    @ManyToMany()
    List<User> users;

    public Groupe(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Message> getMessages() { return messages; }

    public List<User> getUsers() {
        return users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessages(List<Message> messages) { this.messages = messages; }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static List<Groupe> allGroupes() {
        return Groupe.find.all();
    }

    public static Groupe getGroupe(Long groupId) {
        return Groupe.find.byId(groupId);
    }

    public void fetchMessages() {
        List<Message> resultat = Message.find.where().eq("id", this.getId()).findList();
        this.setMessages(resultat);
    }
}
