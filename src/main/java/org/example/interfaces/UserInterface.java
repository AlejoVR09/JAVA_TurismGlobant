package org.example.interfaces;

import org.example.entities.AffiliatedUser;
import org.example.entities.CulturalCompany;
import org.example.entities.PaidEventUser;
import org.example.entities.PrivateCompany;

public interface UserInterface {
    void executeServiceLogic(String operationType, AffiliatedUser userModel);
    void executeServiceLogic(String operationType, CulturalCompany culturalCompanyModel);
    void executeServiceLogic(String operationType, PrivateCompany privateCompany);
    void executeServiceLogic(String operationType, PaidEventUser paidEventUser);
}
