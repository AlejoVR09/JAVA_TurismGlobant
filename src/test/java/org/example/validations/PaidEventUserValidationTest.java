package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaidEventUserValidationTest {
    // Preparo la prueba

    PaidEventUserValidation paidEventUserValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("User's test");
        this.paidEventUserValidation =new PaidEventUserValidation();
    }

    @Test
    public void monthlyCostInvalidValue() {
        Double value=100000000D;
        Double maxValue= 200000D;
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.paidEventUserValidation.validateCost(value, maxValue));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("Invalid Payment!" ,respuesta.getMessage());
    }
    @Test
    public void monthlyCostValidation() {
        Double value=1000D;
        Double maxValue= 200000D;
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.paidEventUserValidation.validateCost(value, maxValue));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }
}