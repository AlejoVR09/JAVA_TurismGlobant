package org.example.datamodels;

import jakarta.persistence.*;

@Entity
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Integer id;
    @Column(name = "nit", nullable = false, length = 50)
    private String nit;
    @Column(name = "names", nullable = false, length = 50)
    private String names;
    @Column(name = "ubication", nullable = false, length = 4)
    private Integer Ubication;
    @Column(name = "description", nullable = false, length = 50)
    private String description;

    public CompanyModel() {
    }

    public CompanyModel(Integer id, String nit, String names, Integer ubication, String description) {
        this.id = id;
        this.nit = nit;
        this.names = names;
        this.Ubication = ubication;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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
