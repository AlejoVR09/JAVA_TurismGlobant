package org.example.controller;

import org.example.Utilities.GetterAutomationTool;
import org.example.datamodels.CulturalCompanyModel;
import org.example.datamodels.PrivateCompanyModel;
import org.example.entities.PrivateCompany;
import org.example.services.PrivateCompanyService;

public class PrivateCompanyController {
    PrivateCompany privateCompany = new PrivateCompany();
    PrivateCompanyService privateCompanyService = new PrivateCompanyService();
    GetterAutomationTool getterAutomationTool = new GetterAutomationTool();

    public void registerPrivateCompany(String nit, String names, Integer ubication, String description, String agentId, String agentName) throws Exception {
        this.privateCompany.setNit(nit);
        this.privateCompany.setNames(names);
        this.privateCompany.setUbication(ubication);
        this.privateCompany.setDescription(description);
        this.privateCompany.setAgentId(agentId);
        this.privateCompany.setAgentName(agentName);
        if (getterAutomationTool.getValues(this.privateCompany)){
            privateCompanyService.registerPrivateCompany(this.privateCompany);
        }
        else{
            throw new Exception("Some value/s is wrong");
        }
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