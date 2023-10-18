package org.example.controller;

import org.example.services.CulturalCompanyService;
import org.example.entities.CulturalCompany;

public class CulturalCompanyController {
    CulturalCompany culturalCompany = new CulturalCompany();
    CulturalCompanyService culturalCompanyService = new CulturalCompanyService();

    public void registerCulturalCompany(String name, String document, String email, Integer ubication) {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.

        this.culturalCompany.setNames(name);
        this.culturalCompany.setUbication(ubication);
        culturalCompanyService.registerCulturalCompany(this.culturalCompany);
    }

    public void deleteCulturalCompany(Integer id) {
        this.culturalCompanyService.deleteCulturalCompany(id);
    }

    public void getCulturalCompanies() {
        this.culturalCompanyService.searchCulturalCompanies();
    }
}