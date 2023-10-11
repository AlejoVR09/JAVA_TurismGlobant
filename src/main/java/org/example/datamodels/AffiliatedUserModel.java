package org.example.datamodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.example.entities.User;

@Entity
public class AffiliatedUserModel extends UserModel {
    @Column(name = "monthlycost")
    private Double monthlyCost;

    public AffiliatedUserModel(){

    }

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
