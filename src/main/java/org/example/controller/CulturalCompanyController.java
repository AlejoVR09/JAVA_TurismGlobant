package org.example.controller;

import org.example.Utilities.GetterAutomationTool;
import org.example.datamodels.CulturalCompanyModel;
import org.example.services.CulturalCompanyService;
import org.example.entities.CulturalCompany;

import java.util.List;

public class CulturalCompanyController {
    CulturalCompany culturalCompany = new CulturalCompany();
    CulturalCompanyService culturalCompanyService = new CulturalCompanyService();

    GetterAutomationTool getterAutomationTool = new GetterAutomationTool();

    public void registerCulturalCompany(String nit, String names, Integer ubication, String description, String ong, String mission, String contactPhone, String contactEmail) throws Exception {
        // THIS METHOD MUST BE UPDATED TO ACCEPT WHATEVER FIELDS ARE REQUIRED.
        this.culturalCompany.setNit(nit);
        this.culturalCompany.setNames(names);
        this.culturalCompany.setUbication(ubication);
        this.culturalCompany.setDescription(description);
        this.culturalCompany.setOng(ong);
        this.culturalCompany.setMission(mission);
        this.culturalCompany.setContactPhone(contactPhone);
        this.culturalCompany.setContactEmail(contactEmail);

        if (getterAutomationTool.getValues(this.culturalCompany)){
            culturalCompanyService.registerCulturalCompany(this.culturalCompany);
        }
        else{
            throw new Exception("Some value/s are wrong!");
        }
    }

    public void deleteCulturalCompany(Integer id) {
        this.culturalCompanyService.deleteCulturalCompany(id);
    }

    public List<CulturalCompanyModel> getCulturalCompanies() {
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
        }
        return this.culturalCompanyService.searchCulturalCompanies();
    }
}