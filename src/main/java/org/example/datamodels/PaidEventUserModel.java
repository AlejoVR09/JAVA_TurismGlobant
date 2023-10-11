package org.example.datamodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PaidEventUserModel extends UserModel {
    public PaidEventUserModel() {
    }

    @Column(name = "costPerEvent")
    private double costPerEvent;

    public PaidEventUserModel(double costPerEvent) {
        this.costPerEvent = costPerEvent;
    }

    public PaidEventUserModel(Integer id, String document, String names, String email, Integer ubication, double costPerEvent) {
        super(id, document, names, email, ubication);
        this.costPerEvent = costPerEvent;
    }
}
