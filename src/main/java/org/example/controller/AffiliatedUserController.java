package org.example.controller;

import org.example.datamodels.AffiliatedUserModel;
import org.example.entities.AffiliatedUser;
import org.example.services.AffiliatedUserService;

public class AffiliatedUserController {

    AffiliatedUser affiliatedUser = new AffiliatedUser();
    AffiliatedUserService affiliatedUserService = new AffiliatedUserService();

    public void registerAffiliatedUser(String names, String document, String email, Integer ubication, Double monthlyCost) {
        this.affiliatedUser.setNames(names);
        this.affiliatedUser.setDocument(document);
        this.affiliatedUser.setEmail(email);
        this.affiliatedUser.setUbication(ubication);
        this.affiliatedUser.setMonthlyCost(monthlyCost);
        affiliatedUserService.registerAffiliatedUser(this.affiliatedUser);
    }

    public void deleteAffiliatedUser(Integer id) {
        this.affiliatedUserService.deleteAffiliatedUser(id);
    }

    public void getAffiliatedUsers() {
        for (AffiliatedUserModel element : this.affiliatedUserService.searchAffiliatedUsers()) {
            System.out.println(
                    "Name: " + element.getNames()+ "\n"+
                    "Document: " + element.getDocument()+ "\n"+
                    "Email: " + element.getEmail()+ "\n"+
                    "Ubication: " + element.getUbication()+ "\n"+
                    "Montly Cost: " + element.getMonthlyCost()+ "\n"
            );
        };

//        System.out.println("CONTROLLER SEARCH RAN");
    }
}
