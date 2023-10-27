package org.example.controller;

import org.example.Utilities.GetterAutomationTool;
import org.example.datamodels.AffiliatedUserModel;
import org.example.entities.AffiliatedUser;
import org.example.services.AffiliatedUserService;

import java.util.List;

public class AffiliatedUserController {

    AffiliatedUser affiliatedUser = new AffiliatedUser();
    AffiliatedUserService affiliatedUserService = new AffiliatedUserService();
    GetterAutomationTool getterAutomationTool = new GetterAutomationTool();

    public void registerAffiliatedUser(String names, String document, String email, Integer ubication, Double monthlyCost) throws Exception {
        this.affiliatedUser.setNames(names);
        this.affiliatedUser.setDocument(document);
        this.affiliatedUser.setEmail(email);
        this.affiliatedUser.setUbication(ubication);
        this.affiliatedUser.setMonthlyCost(monthlyCost);

        if (getterAutomationTool.getValues(this.affiliatedUser)){
            affiliatedUserService.registerAffiliatedUser(this.affiliatedUser);
        }
        else{
            throw new Exception("Some value/s is wrong");
        }
    }

    public void registerAffiliatedUser(String names, String document, String email, Integer ubication, Double monthlyCost, String referred) throws Exception {
        this.affiliatedUser.setNames(names);
        this.affiliatedUser.setDocument(document);
        this.affiliatedUser.setEmail(email);
        this.affiliatedUser.setUbication(ubication);
        this.affiliatedUser.setMonthlyCost(monthlyCost);
        this.affiliatedUser.setReferredId(referred);

        if (getterAutomationTool.getValues(this.affiliatedUser)){
            affiliatedUserService.registerAffiliatedUser(this.affiliatedUser);
        }
        else{
            throw new Exception("Some value/s is wrong");
        }
    }


    public void deleteAffiliatedUser(Integer id) {
        this.affiliatedUserService.deleteAffiliatedUser(id);
    }

    public List<AffiliatedUserModel> getAffiliatedUsers() {
        List<AffiliatedUserModel> affiliatedList=this.affiliatedUserService.searchAffiliatedUsers();
        for (AffiliatedUserModel element : affiliatedList) {
            System.out.println(
                    "Name: " + element.getNames()+ "\n"+
                            "Document: " + element.getDocument()+ "\n"+
                            "Email: " + element.getEmail()+ "\n"+
                            "Ubication: " + element.getUbication()+ "\n"+
                            "Montly Cost: " + element.getMonthlyCost()+ "\n"+
                            "Referred: " + element.getReferredId()+ "\n"+
                            "Referred start date: " + element.getStartDay()+ "\n"+
                            "Referred end date: " + element.getEndDay()+ "\n"
            );
        }
        return affiliatedList;
        //affiliatedUsers = (ArrayList<AffiliatedUserModel>) this.affiliatedUserService.searchAffiliatedUsers();
//        System.out.println("CONTROLLER SEARCH RAN");
    }
}
