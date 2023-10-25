package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AffiliatedUserValidationTest {
    // Preparo la prueba

    AffiliatedUserValidation affiliatedUserValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("User affiliated test");
        this.affiliatedUserValidation =new AffiliatedUserValidation();
    }

    @Test
    public void monthlyCostInvalidValue() {
        Double value=100000000D;
        Double maxValue= 100000D;
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.affiliatedUserValidation.validateCost(value, maxValue));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("Invalid Payment!" ,respuesta.getMessage());
    }
    @Test
    public void monthlyCostValidation(){
        Double value=1000D;
        Double maxValue= 100000D;
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.affiliatedUserValidation.validateCost(value, maxValue));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }
}