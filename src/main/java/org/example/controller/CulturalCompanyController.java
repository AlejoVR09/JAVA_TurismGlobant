package org.example.controller;

import org.example.datamodels.AffiliatedUserModel;
import org.example.datamodels.CulturalCompanyModel;
import org.example.services.CulturalCompanyService;
import org.example.entities.CulturalCompany;

public class CulturalCompanyController {
    CulturalCompany culturalCompany = new CulturalCompany();
    CulturalCompanyService culturalCompanyService = new CulturalCompanyService();

    public void registerCulturalCompany(String nit, String names, Integer ubication, String description, String ong, String mission, String contactPhone, String contactEmail) {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.
        this.culturalCompany.setNit(nit);
        this.culturalCompany.setNames(names);
        this.culturalCompany.setUbication(ubication);
        this.culturalCompany.setDescription(description);
        this.culturalCompany.setOng(ong);
        this.culturalCompany.setMission(mission);
        this.culturalCompany.setContactPhone(contactPhone);
        this.culturalCompany.setContactEmail(contactEmail);
        if (true){
            culturalCompanyService.registerCulturalCompany(this.culturalCompany);
        }
    }

    public void deleteCulturalCompany(Integer id) {
        this.culturalCompanyService.deleteCulturalCompany(id);
    }

    public void getCulturalCompanies() {
        for (CulturalCompanyModel element : this.culturalCompanyService.searchCulturalCompanies()) {
            System.out.println(
                    "Nit: " + element.getNit() + "\n"+
                    "Name: " + element.getNames()+ "\n"+
                            "Ubication: " + element.getUbication()+ "\n"+
                            "Description: " + element.getDescription()+ "\n"+
                            "Ong: " + element.getOng()+ "\n"+
                            "Ong Mission: "+ element.getMission()+"\n"+
                            "Contact Phone: "+ element.getContactPhone()+"\n"+
                            "Contact Email: " + element.getContactEmail()+ "\n"
            );
        };
    }
}