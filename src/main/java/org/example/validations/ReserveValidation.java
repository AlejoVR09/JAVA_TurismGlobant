package org.example.validations;

import org.example.Utilities.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReserveValidation {

    private Util validator=new Util();
    public Boolean datevalidation(String date) throws Exception{
        if (!validator.toSearchCoincidences(date,"^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$")){
            throw new Exception("Invalid format");
        }
        return true;
    }

    public Boolean peoplevalidation(Integer people)throws Exception{
        if (people>4){
            throw new Exception("Too many people");
        }
        return true;
    }
}
