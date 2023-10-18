package org.example.controller;

import org.example.entities.PrivateCompany;
import org.example.services.PrivateCompanyService;

public class PrivateCompanyController {
    PrivateCompany privateCompany = new PrivateCompany();
    PrivateCompanyService privateCompanyService = new PrivateCompanyService();

    public void registerPrivateCompany(String name, String document, String email, Integer ubication) {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.
        this.privateCompany.setNames(name);
        privateCompanyService.registerPrivateCompany(this.privateCompany);
    }

    public void deletePrivateCompany(Integer id) {
        this.privateCompanyService.deletePrivateCompany(id);
    }

    public void getPrivateCompanies() {
        this.privateCompanyService.searchPrivateCompanies();
    }
}