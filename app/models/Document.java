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
public class Document extends Model {

    public static Model.Finder<Long, Document> find = new Model.Finder<Long,Document>(Document.class);


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String title;

    Date creationDate;


    @OneToMany(mappedBy = "document")
    @JsonManagedReference
    Message message;

    String path;

    public Document(Long id, String title, Date creationDate, String path) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.path = path;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public Message getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setPath(String path) {
        this.path = path;
    }
}