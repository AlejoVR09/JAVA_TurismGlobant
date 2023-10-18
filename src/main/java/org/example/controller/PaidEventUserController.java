package org.example.controller;

import org.example.entities.PaidEventUser;
import org.example.services.PaidEventUserService;

public class PaidEventUserController {
    PaidEventUser paidEventUser = new PaidEventUser();
    PaidEventUserService paidEventUserService = new PaidEventUserService();

    public void registerPaidEventUser(String name, String document, String email, Integer ubication) {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.

        this.paidEventUser.setNames(name);
        paidEventUserService.registerPaidEventUser(this.paidEventUser);
    }

    public void deletePaidEventUser(Integer id) {
        this.paidEventUserService.deletePaidEventUser(id);
    }

    public void getPaidEventUsers() {
        this.paidEventUserService.searchPaidEventUsers();
    }
}