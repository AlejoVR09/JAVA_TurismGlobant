package org.example.modelos;

import java.time.LocalDate;

public class Offer {
    private Integer id;
    private String titlle;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double personCost;
    private Integer idLocal;

    public Offer() {

    }

    public Offer(Integer id, String titlle, String description, LocalDate startDate, LocalDate endDate, Double personCost, Integer idLocal) {
        this.id = id;
        this.titlle = titlle;
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
                ", titlle='" + titlle + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", personCost=" + personCost +
                ", idLocal=" + idLocal +
                '}';
    }

    private Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private String getTitlle() {
        return titlle;
    }

    private void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private LocalDate getStartDate() {
        return startDate;
    }

    private void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    private LocalDate getEndDate() {
        return endDate;
    }

    private void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    private Double getPersonCost() {
        return personCost;
    }

    private void setPersonCost(Double personCost) {
        this.personCost = personCost;
    }

    private Integer getIdLocal() {
        return idLocal;
    }

    private void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
