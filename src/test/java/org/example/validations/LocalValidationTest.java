package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalValidationTest {
    // Preparo la prueba

    LocalValidation localValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("lskskskdjflflk");
        this.localValidation=new LocalValidation();
    }

    @Test
    public void nitValidationForLength() {
        String nombre="juanasdll2l";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.localValidation.namevalidation(nombre));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("The name muust not contain numbers",respuesta.getMessage());
    }
    @Test
    public void nitValidationForCharacters() {
        String nombre="juanas";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.namevalidation(nombre));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("the name must contain at least 10 characters",respuesta.getMessage());
    }
    @Test
    public void nitValidation(){
        String nombre="Alejandrova";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.namevalidation(nombre));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void ubicationvalidation() {
        Integer location=1;
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.ubicationvalidation(location));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void emailvalidation() {
        String email="Alejandrova@hsasd.com";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.emailvalidation(email));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }
}