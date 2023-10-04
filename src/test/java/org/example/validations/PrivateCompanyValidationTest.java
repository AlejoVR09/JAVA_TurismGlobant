package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrivateCompanyValidationTest {
    // Preparo la prueba

    CompanyValidation companyValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("Company's test");
        this.companyValidation =new CompanyValidation();
    }

    @Test
    public void nameValidationForLength() {
        String nombre="juanasdll2lassssssssssssssssssssssassss";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.companyValidation.namevalidation(nombre));
        Assertions.assertEquals("The nit must have exactly 10 characters",respuesta.getMessage());
    }

    @Test
    public void nameValidation(){
        String name="Alejandrova";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.companyValidation.namevalidation(name));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void nitValidationForCharacters() {
        String nit="10005324a0";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.companyValidation.nitvalidation(nit));
        Assertions.assertEquals("The nit must have only digits",respuesta.getMessage());
    }

    @Test
    public void nitValidationLenght() {
        String nit="10005324400";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.companyValidation.nitvalidation(nit));
        Assertions.assertEquals("The nit must have exactly 10 characters",respuesta.getMessage());
    }

    @Test
    public void nitValidation(){
        String nit="1000532440";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.companyValidation.nitvalidation(nit));
        Assertions.assertTrue(respuesta);
    }


}