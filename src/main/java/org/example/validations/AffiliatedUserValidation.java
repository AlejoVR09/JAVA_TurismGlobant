package org.example.validations;

import org.example.Utilities.Util;

public class AffiliatedUserValidation {

    Util validator = new Util();

    public Boolean validateCost(Double monthlyCost, Double maxValue) throws Exception{
        if (!this.validator.validateCost(monthlyCost, maxValue)){
            throw new Exception("Invalid Payment!");
        }
        return true;

    }

    public Boolean docvalidation(String doc) throws Exception{
        if (!validator.toSearchCoincidences(doc,"^[0-9]+$")){
            throw new Exception("The Document must have only digits");
        }

        if (doc.length()!=10){
            throw new Exception("The Document must have exactly 10 characters");
        }

        return true;
    }
}
