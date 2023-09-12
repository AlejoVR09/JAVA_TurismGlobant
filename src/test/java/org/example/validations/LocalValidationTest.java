package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalValidationTest {
    // Preparo la prueba

    LocalValidation localValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("Local's test");
        this.localValidation=new LocalValidation();
    }

    @Test
    public void nameValidationForLength() {
        String nombre="juanasdll2lassssssssssssssssssssssassss";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.localValidation.namevalidation(nombre));
        Assertions.assertEquals("The nit must have exactly 10 characters",respuesta.getMessage());
    }

    @Test
    public void nameValidation(){
        String name="Alejandrova";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.localValidation.namevalidation(name));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void nitValidationForCharacters() {
        String nit="10005324a0";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.localValidation.nitvalidation(nit));
        Assertions.assertEquals("The nit must have only digits",respuesta.getMessage());
    }

    @Test
    public void nitValidationLenght() {
        String nit="10005324400";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.localValidation.nitvalidation(nit));
        Assertions.assertEquals("The nit must have exactly 10 characters",respuesta.getMessage());
    }

    @Test
    public void nitValidation(){
        String nit="1000532440";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.localValidation.nitvalidation(nit));
        Assertions.assertTrue(respuesta);
    }


}