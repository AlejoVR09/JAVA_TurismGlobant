package org.example;

import org.example.Utilities.Constants;
import org.example.controller.AffiliatedUserController;
import org.example.controller.CulturalCompanyController;
import org.example.controller.PaidEventUserController;
import org.example.controller.PrivateCompanyController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean band = true;
        try (Scanner userInput = new Scanner(System.in)) {
            while(band){
                String outputChatbox = "Select entity | 1. Affiliated user | 2. Paid per event | 3. Cultural Company | 4. Private Company";
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
                                culturalCompanyController.registerCulturalCompany("juanjosegallego", "1234567890", "juan@gmail.com", 4);
                                break;
                            case 2:
                                culturalCompanyController.getCulturalCompanies();
                                break;
                            case 3:
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
                                privateCompanyController.registerPrivateCompany("juanjosegallego", "1234567890", "juan@gmail.com", 4);
                                break;
                            case 2:
                                privateCompanyController.getPrivateCompanies();
                                break;
                            case 3:
                                privateCompanyController.deletePrivateCompany(1);
                                break;
//                            default:
//                                System.exit(-1);
//                                break;
                        }
                        break;
                    default:
                        band = false;
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}