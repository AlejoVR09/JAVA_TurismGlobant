package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

public class OfferValidationTest {
    OfferValidation offerValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("Local's test");
        this.offerValidation=new OfferValidation();
    }

    @Test
    public void tittleValidationLength(){
        String tittle="sdasdasdasdassssssssssssssssssssssassss";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.offerValidation.tittlevalidation(tittle));
        Assertions.assertEquals("The tittle must have less than 20 characters",respuesta.getMessage());
    }

    @Test
    public void tittleValidation(){
        String tittle="asdasdsad";
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.offerValidation.tittlevalidation(tittle));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void comparingValidationCorrectBooked(){
        LocalDate dateBooked=LocalDate.of(2021,11,11);
        LocalDate dateFinished=LocalDate.of(2021,10,11);
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.offerValidation.comparingvalidation(dateBooked, dateFinished));
        Assertions.assertEquals("Invalid dates",respuesta.getMessage());
    }

    @Test
    public void comparingValidation(){
        LocalDate dateBooked=LocalDate.of(2021,11,11);
        LocalDate dateFinished=LocalDate.of(2021,12,11);
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.offerValidation.comparingvalidation(dateBooked, dateFinished));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void dateValidationFormat(){
        String date="11-11-2121";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.offerValidation.datevalidation(date));
        Assertions.assertEquals("Invalid format",respuesta.getMessage());
    }

    @Test
    public void dateValidation(){
        String date="11/11/2121";
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.offerValidation.datevalidation(date));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void costValidationNegativeValues(){
        Double cost=-1234123D;
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.offerValidation.costvalidation(cost));
        Assertions.assertEquals("The cost must not be negative",respuesta.getMessage());
    }

    @Test
    public void costValidation(){
        Double cost=1234123D;
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.offerValidation.costvalidation(cost));
        Assertions.assertTrue(respuesta);
    }
}
