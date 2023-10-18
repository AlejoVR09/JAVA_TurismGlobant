package org.example.controller;

import org.example.entities.AffiliatedUser;
import org.example.services.AffiliatedUserService;

public class AffiliatedUserController {

    AffiliatedUser affiliatedUser = new AffiliatedUser();
    AffiliatedUserService affiliatedUserService = new AffiliatedUserService();

    public void registerAffiliatedUser(String name, String document, String email, Integer ubication) {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.

        this.affiliatedUser.setNames(name);
        this.affiliatedUser.setDocument(document);
        this.affiliatedUser.setEmail(email);
        this.affiliatedUser.setUbication(ubication);
        affiliatedUserService.registerAffiliatedUser(this.affiliatedUser);
    }

    public void deleteAffiliatedUser(Integer id) {
        this.affiliatedUserService.deleteAffiliatedUser(id);
    }

    public void getAffiliatedUsers() {
        this.affiliatedUserService.searchAffiliatedUsers();
    }
}
