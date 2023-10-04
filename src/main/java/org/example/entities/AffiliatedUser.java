package org.example.entities;

import org.example.validations.AffiliatedUserValidation;
import org.example.validations.UserValidation;

public class AffiliatedUser extends User {
    private Double monthlyCost;

    private AffiliatedUserValidation affiliatedUserValidation=new AffiliatedUserValidation();

    public AffiliatedUser() {

    }

    public AffiliatedUser(Integer id, String document, String names, String email, Integer ubication, Double monthlyCost) {
        super(id, document, names, email, ubication);
        this.monthlyCost = monthlyCost;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Double monthlyCost) {
        try{
            this.affiliatedUserValidation.validateCost(monthlyCost);
            this.monthlyCost = monthlyCost;
        }
        catch (Exception e){

        }
    }

    public void addGuest(){

    }
}
