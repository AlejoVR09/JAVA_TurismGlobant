package org.example.controller;

import org.example.datamodels.AffiliatedUserModel;
import org.example.datamodels.PaidEventUserModel;
import org.example.entities.PaidEventUser;
import org.example.services.PaidEventUserService;

public class PaidEventUserController {
    PaidEventUser paidEventUser = new PaidEventUser();
    PaidEventUserService paidEventUserService = new PaidEventUserService();

    public void registerPaidEventUser(String name, String document, String email, Integer ubication, Double costPerEvent) {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.

        this.paidEventUser.setNames(name);
        this.paidEventUser.setDocument(document);
        this.paidEventUser.setEmail(email);
        this.paidEventUser.setUbication(ubication);
        this.paidEventUser.setCostPerEvent(costPerEvent);
        paidEventUserService.registerPaidEventUser(this.paidEventUser);
    }

    public void deletePaidEventUser(Integer id) {
        this.paidEventUserService.deletePaidEventUser(id);
    }

    public void getPaidEventUsers() {
        for (PaidEventUserModel element : this.paidEventUserService.searchPaidEventUsers()) {
            System.out.println(
                    "Name: " + element.getNames()+ "\n"+
                            "Document: " + element.getDocument()+ "\n"+
                            "Email: " + element.getEmail()+ "\n"+
                            "Ubication: " + element.getUbication()+ "\n"+
                            "Cost Per Event: " + element.getCostPerEvent()+ "\n"
            );
        };
    }
}