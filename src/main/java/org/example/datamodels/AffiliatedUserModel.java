package org.example.datamodels;

import jakarta.persistence.Column;
import org.example.entities.User;

public class AffiliatedUserModel extends User {
    @Column(name = "monthlycost")
    private Double monthlyCost;

    public AffiliatedUserModel(Double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public AffiliatedUserModel(Integer id, String document, String names, String email, Integer ubication, Double monthlyCost) {
        super(id, document, names, email, ubication);
        this.monthlyCost = monthlyCost;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
}
