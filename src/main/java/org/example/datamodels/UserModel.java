package org.example.datamodels;

import jakarta.persistence.*;

@Entity
//@Table(name = "userModel")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "doc_user")
    private String document;

    @Column(name = "name_user", nullable = false, length = 50)
    private String names;

    @Column(name = "email_user")
    private String email;

    @Column(name = "ubication_user")
    private Integer ubication;

    public UserModel() {

    }

    public UserModel(Integer id, String document, String names, String email, Integer ubication) {
        this.id = id;
        this.document = document;
        this.names = names;
        this.email = email;
        this.ubication = ubication;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUbication() {
        return ubication;
    }

    public void setUbication(Integer ubication) {
        this.ubication = ubication;
    }
}
