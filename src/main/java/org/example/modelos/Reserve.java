package org.example.modelos;

import java.time.LocalDate;
import java.util.Date;

public class Reserve {
    public Integer id;
    public Integer idUser;
    public Integer idOfert;
    public Double totalCost;
    public LocalDate reserveDate;

    public Reserve() {

    }

    public Reserve(Integer id, Integer idUser, Integer idOfert, Double totalCost, LocalDate reserveDate) {
        this.id = id;
        this.idUser = idUser;
        this.idOfert = idOfert;
        this.totalCost = totalCost;
        this.reserveDate = reserveDate;
    }

}
