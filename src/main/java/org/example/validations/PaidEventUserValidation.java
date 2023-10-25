package org.example.validations;

import org.example.Utilities.Util;

public class PaidEventUserValidation {

    Util validator = new Util();
    public Boolean validateCost(Double costPerEvent, Double maxValue) throws Exception{
        if (!this.validator.validateCost(costPerEvent, maxValue)){
            throw new Exception("Invalid Payment!");
        }
        return true;
    }
}
