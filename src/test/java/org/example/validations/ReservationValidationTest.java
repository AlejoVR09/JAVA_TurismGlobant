package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ReservationValidationTest {
    ReserveValidation reserveValidation;
    @BeforeEach
    public void initialTesting() {
        System.out.println("Reserve's test");
        this.reserveValidation=new ReserveValidation();
    }

    @Test
    public void dateValidationFormat(){
        String date="11-11-2121";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.reserveValidation.datevalidation(date));
        Assertions.assertEquals("Invalid format",respuesta.getMessage());
    }

    @Test
    public void dateValidation(){
        String date="11/11/2121";
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.reserveValidation.datevalidation(date));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void peopleValidationAmount(){
        Integer people=5;
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.reserveValidation.peoplevalidation(people));
        Assertions.assertEquals("Too many people",respuesta.getMessage());
    }

    @Test
    public void peopleValidation(){
        Integer people=4;
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.reserveValidation.peoplevalidation(people));
        Assertions.assertTrue(respuesta);
    }


}
