package org.example.entities;

import org.example.validations.CompanyValidation;

public abstract class Company {
    private Integer id;
    private String Nit;
    private String names;
    private Integer Ubication;
    private String description;

    private CompanyValidation companyValidation = new CompanyValidation();

    public Company() {

    }

    public Company(Integer id, String nit, String names, Integer ubication, String description) {
        this.id = id;
        this.Nit = nit;
        this.names = names;
        this.Ubication = ubication;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Company{" +
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
        try{
            companyValidation.nitvalidation(nit);
            this.Nit = nit;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        try{
            companyValidation.namevalidation(names);
            this.names = names;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

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

    public abstract Double collect();
}
