package org.example.datamodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PaidEventUserModel extends UserModel {

    @Column(name = "costPerEvent")
    private double costPerEvent;

    public static PaidEventUserModel createPaidEventUserModel() {
        return new PaidEventUserModel();
    }
    public PaidEventUserModel() {
    }

    public PaidEventUserModel(double costPerEvent) {
        this.costPerEvent = costPerEvent;
    }

    public PaidEventUserModel(Integer id, String document, String names, String email, Integer ubication, double costPerEvent) {
        super(id, document, names, email, ubication);
        this.costPerEvent = costPerEvent;
    }
}
