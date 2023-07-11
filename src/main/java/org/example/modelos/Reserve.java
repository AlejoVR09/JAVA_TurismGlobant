package org.example.modelos;

import java.time.LocalDate;
import java.util.Date;

public class Reserve {
    private Integer id;
    private Integer idUser;
    private Integer idOfert;
    private Double totalCost;
    private LocalDate reserveDate;

    public Reserve() {

    }

    public Reserve(Integer id, Integer idUser, Integer idOfert, Double totalCost, LocalDate reserveDate) {
        this.id = id;
        this.idUser = idUser;
        this.idOfert = idOfert;
        this.totalCost = totalCost;
        this.reserveDate = reserveDate;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idOfert=" + idOfert +
                ", totalCost=" + totalCost +
                ", reserveDate=" + reserveDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdOfert() {
        return idOfert;
    }

    public void setIdOfert(Integer idOfert) {
        this.idOfert = idOfert;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(LocalDate reserveDate) {
        this.reserveDate = reserveDate;
    }
}
