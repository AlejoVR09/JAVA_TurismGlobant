package org.example.modelos;

public class Person {

    public Integer id;
    public String document;
    public String names;
    public String email;
    public Integer ubication;


    public Person() {

    }

    public Person(Integer id, String document, String names, String email, Integer ubication) {
        this.id = id;
        this.document = document;
        this.names = names;
        this.email = email;
        this.ubication = ubication;
    }
}
