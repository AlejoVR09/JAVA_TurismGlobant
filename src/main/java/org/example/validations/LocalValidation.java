package org.example.validations;

import org.example.Utilities.Util;

public class LocalValidation {

    private Util validator= new Util();
    public Boolean nitvalidation(String nit) throws Exception{
        if (nit.length()!=10){
            throw new Exception("The nit must have exactly 10 characters");
        }
        else if (!validator.toSearchCoincidences(nit,"^[0-9]+$")){
            throw new Exception("The nit must have only digits");
        }
        return true;
    }

    public Boolean namevalidation(String names) throws Exception{
        if (names.length()>30){
            throw new Exception("The nit must have exactly 10 characters");
        }
        return true;
    }
}
