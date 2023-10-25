package org.example;

import org.example.Utilities.Constants;
import org.example.controller.AffiliatedUserController;
import org.example.controller.CulturalCompanyController;
import org.example.controller.PaidEventUserController;
import org.example.controller.PrivateCompanyController;
import org.example.entities.AffiliatedUser;
import org.example.entities.CulturalCompany;
import org.example.entities.PaidEventUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                                affiliatedUserController.registerAffiliatedUser("juanjosegallego", "1234567890", "juan@gmail.com", 4, 42025.5D);
                                break;
                            case 2:
                                affiliatedUserController.getAffiliatedUsers();
                                break;
                            case 3:
                                // System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                // affiliatedUserController.deleteAffiliatedUser(userInput.nextInt());
                                affiliatedUserController.deleteAffiliatedUser(1);
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
                                paidEventUserController.registerPaidEventUser("Alejandrooo", "1234567890", "alejo@gmail.com", 3, 50000.50D);
                                break;
                            case 2:
                                paidEventUserController.getPaidEventUsers();
                                break;
                            case 3:
                                // System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                // paidEventUserController.deletePaidEventUser(userInput.nextInt());
                                paidEventUserController.deletePaidEventUser(1);
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
                                culturalCompanyController.registerCulturalCompany("1231231231", "Blend", 1, "Yes yes yes", "Claro", "Pal pueblo", "3123123123","alej@gmail.com");
                                break;
                            case 2:
                                culturalCompanyController.getCulturalCompanies();
                                break;
                            case 3:
                                // System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                // culturalCompanyController.deleteCulturalCompany(userInput.nextInt());
                                culturalCompanyController.deleteCulturalCompany(1);
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
                                privateCompanyController.registerPrivateCompany("1231231231", "Blend", 1, "Yes yes yes", "23", "Andres");
                                break;
                            case 2:
                                privateCompanyController.getPrivateCompanies();
                                break;
                            case 3:
                                // System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                // privateCompanyController.deletePrivateCompany(userInput.nextInt());
                                privateCompanyController.deletePrivateCompany(1);
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
    }
}