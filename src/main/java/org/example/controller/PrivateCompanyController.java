package org.example.controller;

import org.example.datamodels.CulturalCompanyModel;
import org.example.datamodels.PrivateCompanyModel;
import org.example.entities.PrivateCompany;
import org.example.services.PrivateCompanyService;

public class PrivateCompanyController {
    PrivateCompany privateCompany = new PrivateCompany();
    PrivateCompanyService privateCompanyService = new PrivateCompanyService();

    public void registerPrivateCompany(String nit, String names, Integer ubication, String description, String agentId, String agentName) {
        this.privateCompany.setNit(nit);
        this.privateCompany.setNames(names);
        this.privateCompany.setUbication(ubication);
        this.privateCompany.setDescription(description);
        this.privateCompany.setAgentId(agentId);
        this.privateCompany.setAgentName(agentName);
        privateCompanyService.registerPrivateCompany(this.privateCompany);
    }

    public void deletePrivateCompany(Integer id) {
        this.privateCompanyService.deletePrivateCompany(id);
    }

    public void getPrivateCompanies() {
        for (PrivateCompanyModel element : this.privateCompanyService.searchPrivateCompanies()) {
            System.out.println(
                    "Nit: " + element.getNit() + "\n"+
                            "Name: " + element.getNames()+ "\n"+
                            "Ubication: " + element.getUbication()+ "\n"+
                            "Description: " + element.getDescription()+ "\n"+
                            "Agent ID: " + element.getAgentId()+ "\n"+
                            "Agent Name: "+ element.getAgentName()+"\n"
            );
        };
    }
}