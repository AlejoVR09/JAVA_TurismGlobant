package org.example.validations;

import org.example.Utilities.Util;

public class PrivateCompanyValidation {

    public Boolean costvalidation(Double payment) throws Exception{
        if (payment<0){
            throw new Exception("The cost must not be negative");
        }
        return true;
    }

}
