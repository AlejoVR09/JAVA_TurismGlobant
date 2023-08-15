package org.example.validations;

import org.example.Utilities.Util;

import java.time.LocalDate;

public class OfferValidation {

    private Util validator=new Util();
    public Boolean tittlevalidation(String tittles) throws Exception{
        if (tittles.length()>20){
            throw new Exception("The tittle must have less than 20 characters");
        }
        return true;
    }

    public Boolean comparingvalidation(LocalDate startDate, LocalDate endDate) throws Exception{
        if (startDate.isBefore(endDate)){
            return true;
        }
        throw new Exception("Invalid dates");

    }

    public Boolean datevalidation(String date) throws Exception{
        if (!validator.toSearchCoincidences(date,"^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$")){
            throw new Exception("Invalid format");
        }
        return true;
    }

    public Boolean costvalidation(Double personCost) throws Exception{
        if (personCost<0){
            throw new Exception("The cost must not be negative");
        }
        return true;
    }

}
