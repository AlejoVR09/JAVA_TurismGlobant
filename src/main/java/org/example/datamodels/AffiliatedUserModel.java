package org.example.datamodels;

import jakarta.persistence.*;
import org.example.entities.User;

import java.time.LocalDate;

@Entity
//@Table(name = "affiliatedUser")
public class AffiliatedUserModel extends UserModel {
    //@ManyToOne
    //@JoinColumn(name = "id_user")
    //private UserModel userModel;

    @Column(name = "monthlycost")
    private Double monthlyCost;

    @Column(name = "referredId")
    private String referredId;

    @Column(name = "startDay")
    private LocalDate startDay;

    @Column(name = "endDay")
    private LocalDate endDay;

    public AffiliatedUserModel(){

    }

    public static AffiliatedUserModel createAffiliatedUserModel() {
        return new AffiliatedUserModel();
    }

    public AffiliatedUserModel(Double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public AffiliatedUserModel(Integer id, String document, String names, String email, Integer ubication, Double monthlyCost, String referredId) {
        super(id, document, names, email, ubication);
        this.monthlyCost = monthlyCost;
        this.referredId = referredId;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public String getReferredId() {
        return referredId;
    }

    public void setReferredId(String referredId) {
        this.referredId = referredId;
        this.startDay = LocalDate.now();
        this.endDay = LocalDate.ofYearDay(startDay.getYear(), startDay.getDayOfYear());
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }
}
