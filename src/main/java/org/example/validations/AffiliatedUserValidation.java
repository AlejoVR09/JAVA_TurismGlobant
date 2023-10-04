package org.example.validations;

import org.example.Utilities.Util;

public class AffiliatedUserValidation {

    Util validator = new Util();

    public void validateCost(Double monthlyCost) {
        if (!this.validator.validateCost(monthlyCost)){

        }

    }
}
