package org.example;

import org.example.validations.PersonValidation;
import org.example.models.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Person ObjUser=new Person();
        ObjUser.setNames("Alejooooooooo");
        ObjUser.setEmail("alejo@gmail.co");
        ObjUser.setUbication(3);

        Local ObjLocal=new Local();
        ObjLocal.setNames("Vil Gates");
        ObjLocal.setNit("123456789");

        Offer ObjOffer=new Offer();
        ObjOffer.setTittle("Alejoo");
        ObjOffer.setStartDate("10/11/2121");
        ObjOffer.setEndDate("11/11/2121");
        ObjOffer.setPersonCost(123141.1233);


        Reserve ObjReserve=new Reserve();
        //String year; String day; String month; String date=day+"-"+month+"-"+year
        //String date= "2023-11-21"
        ObjReserve.setReserveDate("11/11/2121");
        ObjReserve.setUsers(4);

        //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
    }
}