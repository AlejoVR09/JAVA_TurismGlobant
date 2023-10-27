package org.example.datamodels;

import jakarta.persistence.*;

@Entity
//@Table(name = "PaidEventUser")
public class PaidEventUserModel extends UserModel {

    //@ManyToOne
    //@JoinColumn(name = "id_user")
    //private UserModel userModel;

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

//    public UserModel getUserModel() {
//        return userModel;
//    }
//
//    public void setUserModel(UserModel userModel) {
//        this.userModel = userModel;
//    }

    public double getCostPerEvent() {
        return costPerEvent;
    }

    public void setCostPerEvent(double costPerEvent) {
        this.costPerEvent = costPerEvent;
    }

    public Double calculateDescount(Boolean company){

        if(company){
            return costPerEvent;
        }
        else{
            return costPerEvent-(costPerEvent*0.3);
        }
    }
}
