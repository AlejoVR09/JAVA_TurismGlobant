package org.example.datamodels;

import jakarta.persistence.*;
import org.example.entities.User;

@Entity
//@Table(name = "affiliatedUser")
public class AffiliatedUserModel extends UserModel {
    //@ManyToOne
    //@JoinColumn(name = "id_user")
    //private UserModel userModel;

    @Column(name = "monthlycost")
    private Double monthlyCost;

    public AffiliatedUserModel(){

    }

    public static AffiliatedUserModel createAffiliatedUserModel() {
        return new AffiliatedUserModel();
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
