package org.example.validations;

import org.example.Utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.isDigit;

public class PersonValidation {
    private Util validator= new Util();
    public Boolean namevalidation(String name) throws Exception{
//        if(name.length()>=10){
//            for (int i = 0; i < name.length(); i++) {
//                if(isDigit(name.charAt(i))){
//                    return false;
//                }
//            }
//            return true;
//        }
//        else {
//            return false;
//        }
        if(!validator.toSearchCoincidences(name,"^[a-zA-Z]+$")){
            throw new Exception("The name muust not contain numbers");
        }
        if (name.length()<10){
            throw new Exception("the name must contain at least 10 characters");
        }

        return true;
    }

    public Boolean ubicationvalidation(){
        return false;
    }

    public Boolean emailvalidation(String email) throws Exception{
        if(!validator.toSearchCoincidences(email,"^[a-zA-Z0-9._%+-]+[a-zA-Z0-9.-]+\\[a-zA-Z]{2,}$")){
            throw new Exception("Email invalid");
        }
        else{
            return true;
        }
    }


}
