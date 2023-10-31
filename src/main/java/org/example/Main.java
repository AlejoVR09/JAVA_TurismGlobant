package org.example;

import org.example.Utilities.Constants;
import org.example.controller.AffiliatedUserController;
import org.example.controller.CulturalCompanyController;
import org.example.controller.PaidEventUserController;
import org.example.controller.PrivateCompanyController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        try (Scanner userInput = new Scanner(System.in)) {
            while(flag){
                String outputChatbox = Constants.OUTPUT_CHATBOX_STATIC_SELECT;
                System.out.println(outputChatbox);
                int selectedOption = userInput.nextInt();
                switch (selectedOption) {
                    case 1 -> {
                        AffiliatedUserController affiliatedUserController = new AffiliatedUserController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch (selectedOption) {
                            case 1 -> {
                                try {
                                    System.out.println("Write your name:");
                                    String name =userInput.next();
                                    userInput.nextLine();
                                    System.out.println("Write your document:");
                                    String doc = userInput.next();
                                    userInput.nextLine();
                                    System.out.println("Write your email:");
                                    String email = userInput.next();
                                    userInput.nextLine();
                                    System.out.println("Write your ubication:");
                                    Integer ubication = userInput.nextInt();
                                    System.out.println("Write your monthly cost for sub:");
                                    Double monthlyCost = userInput.nextDouble();
                                    System.out.println("Do you want to refer someone? y/n");
                                    String choice = userInput.next();
                                    userInput.nextLine();
                                    if (choice.equals("y")) {
                                        System.out.println("Write the referred document: ");
                                        String referred = userInput.next();
                                        affiliatedUserController.registerAffiliatedUser(name, doc, email, ubication, monthlyCost, referred);

                                    } else {
                                        affiliatedUserController.registerAffiliatedUser(name, doc, email, ubication, monthlyCost);
                                    }
                                    //affiliatedUserController.registerAffiliatedUser("juanjosegallego", "1234567890", "juan@gmail.com", 4, 42025.5D);

                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            case 2 -> affiliatedUserController.getAffiliatedUsers();
                            case 3 -> {
                                System.out.println(Constants.OUTPUT_CHATBOX_STATIC_DELETE);
                                affiliatedUserController.deleteAffiliatedUser(userInput.nextInt());
                            }
                        }
                    }
                    case 2 -> {
                        PaidEventUserController paidEventUserController = new PaidEventUserController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch (selectedOption) {
                            case 1 -> {
                                try {
                                    System.out.println("Write your name:");
                                    String name = userInput.next();
                                    userInput.nextLine();
                                    System.out.println("Write your document:");
                                    String doc = userInput.next();
                                    userInput.nextLine();
                                    System.out.println("Write your email:");
                                    String email = userInput.next();
                                    userInput.nextLine();
                                    System.out.println("Write your ubication:");
                                    Integer ubication = userInput.nextInt();
                                    System.out.println("Write your cost per event:");
                                    Double costPerEvent = userInput.nextDouble();
                                    paidEventUserController.registerPaidEventUser(name, doc, email, ubication, costPerEvent);
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            case 2 -> paidEventUserController.getPaidEventUsers();
                            case 3 -> {
                                System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                paidEventUserController.deletePaidEventUser(userInput.nextInt());
                            }
                        }
                    }
                    case 3 -> {
                        CulturalCompanyController culturalCompanyController = new CulturalCompanyController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch (selectedOption) {
                            case 1 -> {
                                System.out.println("Write the company's Nit:");
                                String nit = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Name:");
                                String names = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Ubication:");
                                Integer ubication = userInput.nextInt();
                                System.out.println("Write the company's Description:");
                                String description = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's ONG:");
                                String ong = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Mission:");
                                String mission = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Phone:");
                                String contactPhone = userInput.nextLine();
                                System.out.println("Write the company's contact Email:");
                                String contactEmail = userInput.next();
                                userInput.nextLine();
                                culturalCompanyController.registerCulturalCompany(nit, names, ubication, description, ong, mission, contactEmail, contactPhone);
                            }
                            case 2 -> culturalCompanyController.getCulturalCompanies();
                            case 3 -> {
                                System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                culturalCompanyController.deleteCulturalCompany(userInput.nextInt());
                            }
                        }
                    }
                    case 4 -> {
                        PrivateCompanyController privateCompanyController = new PrivateCompanyController();
                        System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                        selectedOption = userInput.nextInt();
                        switch (selectedOption) {
                            case 1 -> {
                                System.out.println("Write the company's Nit:");
                                String nit = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Name:");
                                String names = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Ubication:");
                                Integer ubication = userInput.nextInt();
                                System.out.println("Write the company's Description:");
                                String description = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's Phone:");
                                String agentId = userInput.next();
                                userInput.nextLine();
                                System.out.println("Write the company's contact Email:");
                                String agentName = userInput.next();
                                userInput.nextLine();
                                privateCompanyController.registerPrivateCompany(nit, names, ubication, description, agentId, agentName);
                            }
                            case 2 -> privateCompanyController.getPrivateCompanies();
                            case 3 -> {
                                System.out.println(Constants.OUTPUT_CHATBOX_STATIC);
                                privateCompanyController.deletePrivateCompany(userInput.nextInt());
                            }
                        }
                    }
                    default -> flag = false;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}