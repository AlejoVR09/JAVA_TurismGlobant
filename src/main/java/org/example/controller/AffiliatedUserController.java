package org.example.controller;

import org.example.datamodels.AffiliatedUserModel;
import org.example.entities.AffiliatedUser;
import org.example.services.AffiliatedUserService;

public class AffiliatedUserController {

    AffiliatedUser affiliatedUser = new AffiliatedUser();
    AffiliatedUserService affiliatedUserService = new AffiliatedUserService();

    public void registerAffiliatedUser(String names, String document, String email, Integer ubication) {
        this.affiliatedUser.setNames(names);
        this.affiliatedUser.setDocument(document);
        this.affiliatedUser.setEmail(email);
        this.affiliatedUser.setUbication(ubication);
        affiliatedUserService.registerAffiliatedUser(this.affiliatedUser);
    }

    public void deleteAffiliatedUser(Integer id) {
        this.affiliatedUserService.deleteAffiliatedUser(id);
    }

    public void getAffiliatedUsers() {
        for (AffiliatedUserModel element : this.affiliatedUserService.searchAffiliatedUsers()) {
            System.out.println(element.getNames());
        };

        System.out.println("CONTROLLER SEARCH RAN");
    }
}
