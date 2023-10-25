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
}
