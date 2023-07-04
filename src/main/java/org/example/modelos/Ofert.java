package org.example.modelos;

import java.time.LocalDate;

public class Ofert {
    public Integer id;
    public String titlle;
    public String description;
    public LocalDate startDate;
    public LocalDate endDate;
    public Double personCost;
    public Integer idLocal;

    public Ofert() {

    }

    public Ofert(Integer id, String titlle, String description, LocalDate startDate, LocalDate endDate, Double personCost, Integer idLocal) {
        this.id = id;
        this.titlle = titlle;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.personCost = personCost;
        this.idLocal = idLocal;
    }

}
