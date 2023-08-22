package org.example.validations;

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
    public void nameValidationForLenght(String name) {

    }
    @Test
    public void nameValidationForSpecialChars(String name) {

    }
    @Test
    public void nameValidation(String name){

    }
    @Test
    public void ubicationvalidation() {
    }

    @Test
    public void emailvalidation() {
    }
}