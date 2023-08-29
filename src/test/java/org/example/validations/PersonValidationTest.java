package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonValidationTest {
    // Preparo la prueba

    PersonValidation personValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("lskskskdjflflk");
        this.personValidation=new PersonValidation();
    }

    @Test
    public void nameValidationForLenght() {
        String nombre="juanasdll l";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.namevalidation(nombre));
        Assertions.assertEquals("The name muust not contain numbers",respuesta.getMessage());
    }
    @Test
    public void nameValidationForSpecialChars() {
        String nombre="juanasd@@l";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.namevalidation(nombre));
        Assertions.assertEquals("the name must contain at least 10 characters",respuesta.getMessage());
    }
    @Test
    public void nameValidation(){
        String nombre="juan";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.namevalidation(nombre));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void ubicationvalidation() {
    }

    @Test
    public void emailvalidation() {
    }
}