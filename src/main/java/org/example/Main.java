package org.example;

import org.example.Utilities.Constants;
import org.example.Utilities.GetterAutomationTool;
import org.example.controller.AffiliatedUserController;
import org.example.controller.CulturalCompanyController;
import org.example.controller.PaidEventUserController;
import org.example.controller.PrivateCompanyController;

import org.example.entities.AffiliatedUser;
import org.example.entities.CulturalCompany;
import org.example.entities.Offer;
import org.example.entities.PaidEventUser;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Boolean flag = true;
        try (Scanner userInput = new Scanner(System.in)) {
            while(flag){
                String outputChatbox = Constants.OUTPUT_CHATBOX_STATIC_SELECT;
                System.out.println(outputChatbox);
                Integer selectedOption = userInput.nextInt();
                switch (selectedOption) {
                    case 1:
                        AffiliatedUserController affiliatedUserController = new AffiliatedUserController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch(selectedOption) {
                            case 1:
                                try {
                                    System.out.println("Write your name:");
                                    String name=userInput.next();
                                    System.out.println("Write your document:");
                                    String doc=userInput.next();
                                    System.out.println("Write your email:");
                                    String email=userInput.next();
                                    System.out.println("Write your ubication:");
                                    Integer ubication=userInput.nextInt();
                                    System.out.println("Write your monthly cost for sub:");
                                    Double monthlyCost=userInput.nextDouble();
                                    System.out.println("Do you want to refer someone? y/n");
                                    String choice = userInput.next();
                                    if (choice.equals("y")){
                                        System.out.println("Write the referred document: ");
                                        String referred = userInput.next();
                                        affiliatedUserController.registerAffiliatedUser(name, doc, email, ubication, monthlyCost, referred);
                                    }
                                    else{
                                        affiliatedUserController.registerAffiliatedUser(name, doc, email, ubication, monthlyCost);
                                    }
                                    //affiliatedUserController.registerAffiliatedUser("juanjosegallego", "1234567890", "juan@gmail.com", 4, 42025.5D, "1231231233");

                                }
                                catch (Exception e){
                                    System.out.println(e.getMessage());
                                }
                                while(true){
                                    break;
                                }
                                break;
                            case 2:
                                affiliatedUserController.getAffiliatedUsers();
                                break;
                            case 3:
                                System.out.println(Constants.OUTPUT_CHATBOX_STATIC_DELETE);
                                affiliatedUserController.deleteAffiliatedUser(userInput.nextInt());
                                //affiliatedUserController.deleteAffiliatedUser(1);
                                break;
//                            default:
//                                System.exit(-1);
//                                break;
                        }
                        break;
                    case 2:
                        PaidEventUserController paidEventUserController = new PaidEventUserController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch(selectedOption) {
                            case 1:
                                try {
                                    System.out.println("Write your name:");
                                    String name=userInput.next();
                                    System.out.println("Write your document:");
                                    String doc=userInput.next();
                                    System.out.println("Write your email:");
                                    String email=userInput.next();
                                    System.out.println("Write your ubication:");
                                    Integer ubication=userInput.nextInt();
                                    System.out.println("Write your cost per event:");
                                    Double costPerEvent=userInput.nextDouble();
                                    paidEventUserController.registerPaidEventUser(name, doc, email, ubication, costPerEvent);
                                }
                                catch (Exception e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 2:
                                paidEventUserController.getPaidEventUsers();
                                break;
                            case 3:
                                System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                paidEventUserController.deletePaidEventUser(userInput.nextInt());
                                //paidEventUserController.deletePaidEventUser(1);
                                break;
//                            default:
//                                System.exit(-1);
//                                break;
                        }
                        break;
                    case 3:
                        CulturalCompanyController culturalCompanyController = new CulturalCompanyController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch(selectedOption) {
                            case 1:

                                System.out.println("Write the company's Nit:");
                                String nit=userInput.next();
                                System.out.println("Write the company's Name:");
                                String names=userInput.next();
                                System.out.println("Write the company's Ubication:");
                                Integer ubication=userInput.nextInt();
                                System.out.println("Write the company's Description:");
                                String description=userInput.next();
                                System.out.println("Write the company's ONG:");
                                String ong=userInput.next();
                                System.out.println("Write the company's Mission:");
                                String mission=userInput.next();
                                System.out.println("Write the company's Phone:");
                                String contactPhone=userInput.next();
                                System.out.println("Write the company's contact Email:");
                                String contactEmail=userInput.next();

                                culturalCompanyController.registerCulturalCompany(nit, names,ubication, description, ong, mission, contactEmail, contactPhone);

                                break;
                            case 2:
                                culturalCompanyController.getCulturalCompanies();
                                break;
                            case 3:
                                 System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                 culturalCompanyController.deleteCulturalCompany(userInput.nextInt());
                                //culturalCompanyController.deleteCulturalCompany(1);
                                break;
//                            default:
//                                System.exit(-1);
//                                break;
                        }
                        break;
                    case 4:
                        PrivateCompanyController privateCompanyController = new PrivateCompanyController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch(selectedOption) {
                            case 1:
                                System.out.println("Write the company's Nit:");
                                String nit=userInput.next();
                                System.out.println("Write the company's Name:");
                                String names=userInput.next();
                                System.out.println("Write the company's Ubication:");
                                Integer ubication=userInput.nextInt();
                                System.out.println("Write the company's Description:");
                                String description=userInput.next();
                                System.out.println("Write the company's Phone:");
                                String agentId=userInput.next();
                                System.out.println("Write the company's contact Email:");
                                String agentName=userInput.next();

                                privateCompanyController.registerPrivateCompany(nit, names, ubication, description, agentId, agentName);
                                break;
                            case 2:
                                privateCompanyController.getPrivateCompanies();
                                break;
                            case 3:
                                 System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                 privateCompanyController.deletePrivateCompany(userInput.nextInt());
                                //privateCompanyController.deletePrivateCompany(1);
                                break;
//                            default:
//                                System.exit(-1);
//                                break;
                        }
                        break;


                    default:
                        flag = false;
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        PaidEventUser user = new PaidEventUser();
//        user.setCostPerEvent(99999D);
//        System.out.println(user.getCostPerEvent());

//        CulturalCompany company = new CulturalCompany();
//        GetterAutomationTool tool = new GetterAutomationTool();
//        AffiliatedUser user =new AffiliatedUser();
//        try {
//            tool.setValues(user);
//            System.out.println(user.getMonthlyCost());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }


    }
}