package org.example.models;

public class Local {
    private Integer id;
    private String Nit;
    private String names;
    private Integer Ubication;
    private String description;

    public Local() {

    }

    public Local(Integer id, String nit, String names, Integer ubication, String description) {
        this.id = id;
        this.Nit = nit;
        this.names = names;
        this.Ubication = ubication;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", Nit='" + Nit + '\'' +
                ", names='" + names + '\'' +
                ", Ubication=" + Ubication +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Integer getUbication() {
        return Ubication;
    }

    public void setUbication(Integer ubication) {
        Ubication = ubication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
