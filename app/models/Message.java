package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
public class Message extends Model {


    public static Model.Finder<Long, Message> find = new Model.Finder<Long,Message>(Message.class);


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;


    String content;


    Date creationDate;


    @ManyToOne(optional=false)
    @JsonBackReference
    User autheur;

    @ManyToOne(optional=true)
    @JsonBackReference
    Groupe groupe;

    @ManyToOne(optional=true)
    @JsonBackReference
    Document document;

    public Message(Long id, String content, Date creationDate,  User autheur, Groupe groupe, Document document) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        this.autheur = autheur;
        this.groupe = groupe;
        this.document = document;
    }



    public Long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public User getAutheur() {
        return autheur;
    }


    public Groupe getGroupe() {
        return groupe;
    }

    public Document getDocument() {
        return document;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setCreationDate (Date creationDate) {
        this.creationDate = creationDate;
    }


    public void setAutheur(User autheur) {
        this.autheur = autheur;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}