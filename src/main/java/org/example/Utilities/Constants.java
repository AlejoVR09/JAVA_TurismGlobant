package org.example.Utilities;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final String OUTPUT_CHATBOX_STATIC = "Select action | 1. Register new entity | 2. View all | 3. Delete entity by ID";
    private static final String PERSISTANCE_CONFIGURATION = "conexionbd";

    // PLACE ALL THE FIELDS THAT WILL BE USED IN THE CONTROLLER (REGISTER) METHOD IN THIS LIST......
    private static final List<String> listOfAcceptedAffiliatedUserFields = Arrays.asList(
            "names", "document", "email", "ubication", "monthlyCost"
    );
    public static final List<String> listOfAcceptedCulturalCompanyFields = Arrays.asList(
            "nit", "names", "ubication", "description"
    );
    public static final List<String> listOfAcceptedPaidEventUserFields = Arrays.asList(
            "names", "document", "email", "ubication", "costPerEvent"
    );
    public static final List<String> listOfAcceptedPrivateCompanyFields = Arrays.asList(
            "nit", "names", "ubication", "description"
    );
    public static List<String> getListOfAcceptedCulturalCompanyFields() {
        return listOfAcceptedCulturalCompanyFields;
    }
    public static List<String> getListOfAcceptedPaidEventUserFields() {
        return listOfAcceptedPaidEventUserFields;
    }
    public static List<String> getListOfAcceptedAffiliatedUserFields() {
        return listOfAcceptedAffiliatedUserFields;
    }
    public static List<String> getListOfAcceptedPrivateCompanyFields() {
        return listOfAcceptedPrivateCompanyFields;
    }
    public static String getPersistanceConfiguration() {
        return PERSISTANCE_CONFIGURATION;
    }
}
