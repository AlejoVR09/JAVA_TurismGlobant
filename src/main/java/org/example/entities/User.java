package org.example.entities;

import org.example.interfaces.UserInterface;
import org.example.validations.UserValidation;

public class User {

    private Integer id;
    private String document;
    private String names;
    private String email;
    private Integer ubication;

    private UserValidation userValidator=new UserValidation();
    public User() {

    }

    public User(Integer id, String document, String names, String email, Integer ubication) {
        this.id = id;
        this.document = document;
        this.names = names;
        this.email = email;
        this.ubication = ubication;
    }


    public String toString() {
        return "Person{" +
                "id=" + id +
                ", document='" + document + '\'' +
                ", names='" + names + '\'' +
                ", email='" + email + '\'' +
                ", ubication=" + ubication +
                '}';
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
        try {
            this.userValidator.docvalidation(document);
            this.document = document;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public String getNames() {
        return names;
    }


    public void setNames(String names) {
        try {
            this.userValidator.namevalidation(names);
            this.names = names;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        try {
            this.userValidator.emailvalidation(email);
            this.email = email;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public Integer getUbication() {
        return ubication;
    }


    public void setUbication(Integer ubication) {
        try{
            userValidator.ubicationvalidation(ubication);
            this.ubication = ubication;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
