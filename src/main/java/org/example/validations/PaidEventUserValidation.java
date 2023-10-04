package org.example.validations;

import org.example.Utilities.Util;

public class PaidEventUserValidation {

    Util validator = new Util();
    public void validateCost(double costPerEvent) {
        if (!this.validator.validateCost(costPerEvent)){

        }
    }
}
