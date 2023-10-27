package org.example.entities;

import org.example.validations.OfferValidation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Offer {
    private Integer id;
    private String tittle;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double personCost;
    private Integer idLocal;



    private OfferValidation offerValidation=new OfferValidation();

    public Offer() {

    }

    public Offer(Integer id, String titlle, String description, LocalDate startDate, LocalDate endDate, Double personCost, Integer idLocal) {
        this.id = id;
        this.tittle = titlle;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.personCost = personCost;
        this.idLocal = idLocal;
    }

    @Override
    public String toString() {
        return "Ofert{" +
                "id=" + id +
                ", titlle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", personCost=" + personCost +
                ", idLocal=" + idLocal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String titlle) {
        try{
            this.offerValidation.tittlevalidation(titlle);
            this.tittle = titlle;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        try{
            this.offerValidation.datevalidation(startDate);
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date=LocalDate.parse(startDate,formatter);
            this.startDate = date;

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        try{
            this.offerValidation.datevalidation(endDate);
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date=LocalDate.parse(endDate,formatter);
            this.offerValidation.comparingvalidation(this.startDate, date);
            this.endDate = date;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public Double getPersonCost() {
        return personCost;
    }

    public void setPersonCost(Double personCost) {
        try{
            this.offerValidation.costvalidation(personCost);
            this.personCost = personCost;

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public OfferValidation getOfferValidation() {
        return offerValidation;
    }

    public void setOfferValidation(OfferValidation offerValidation) {
        this.offerValidation = offerValidation;
    }
}
