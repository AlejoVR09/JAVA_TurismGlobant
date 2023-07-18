package org.example.Validation;

import static java.lang.Character.isDigit;

public class PersonValidation {

    public Boolean namevalidation(String name){
        if(name.length()>=10){
            for (int i = 0; i < name.length(); i++) {
                if(isDigit(name.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean ubicationvalidation(){
        return false;
    }

    public Boolean emailvalidation(){
        return false;
    }


}
