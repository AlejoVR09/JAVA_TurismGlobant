package org.example.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public Boolean toSearchCoincidences(String validate,String expres){
        Pattern patron=Pattern.compile(expres);
        Matcher coincidencia=patron.matcher(validate);
        if(coincidencia.matches()){
            return true;
        }
        else{
            return false;
        }
    }
}
