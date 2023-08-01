package org.example.models;

import org.example.validations.PersonValidation;

public class Person {

    private Integer id;
    private String document;
    private String names;
    private String email;
    private Integer ubication;

    private PersonValidation userValidator=new PersonValidation();
    public Person() {

    }

    public void Person(Integer id, String document, String names, String email, Integer ubication) {
        this.id = id;
        this.document = document;
        this.names = names;
        this.email = email;
        this.ubication = ubication;
    }

    @Override
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
        this.document = document;
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
        this.email = email;
    }

    public Integer getUbication() {
        return ubication;
    }

    public void setUbication(Integer ubication) {
        this.ubication = ubication;
    }
}
