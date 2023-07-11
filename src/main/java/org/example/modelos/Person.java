package org.example.modelos;

public class Person {

    private Integer id;
    private String document;
    private String names;
    private String email;
    private Integer ubication;


    public Person() {

    }

    public Person(Integer id, String document, String names, String email, Integer ubication) {
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
