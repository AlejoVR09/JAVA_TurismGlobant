package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CulturalCompanyValidationTest {
    // Preparo la prueba

    CulturalCompanyValidation culturalCompanyValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("Company's test");
        this.culturalCompanyValidation =new CulturalCompanyValidation();
    }

    @Test
    public void costValidationNegativeValues(){
        Double cost=-1234123D;
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.culturalCompanyValidation.costvalidation(cost));
        Assertions.assertEquals("The cost must not be negative",respuesta.getMessage());
    }

    @Test
    public void costValidation(){
        Double cost=1234123D;
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.culturalCompanyValidation.costvalidation(cost));
        Assertions.assertTrue(respuesta);
    }


}