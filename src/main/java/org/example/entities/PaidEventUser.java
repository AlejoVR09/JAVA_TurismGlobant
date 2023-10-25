package org.example.entities;

import org.example.validations.AffiliatedUserValidation;
import org.example.validations.PaidEventUserValidation;

public class PaidEventUser extends User {
    private double costPerEvent;

    private PaidEventUserValidation paidEventUserValidation=new PaidEventUserValidation();

    public PaidEventUser() {
    }

    public PaidEventUser(Integer id, String document, String names, String email, Integer ubication, double costPerEvent) {
        super(id, document, names, email, ubication);
        this.costPerEvent = costPerEvent;
    }

    public double getCostPerEvent() {
        return costPerEvent;
    }

    public void setCostPerEvent(double costPerEvent) {
        try {
            this.paidEventUserValidation.validateCost(costPerEvent, 200000D);
            this.costPerEvent = costPerEvent;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void calculateDescount(){

    }
}
