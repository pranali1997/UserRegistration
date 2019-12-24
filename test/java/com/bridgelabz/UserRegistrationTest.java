package com.bridgelabz;

import com.bridgelabz.UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void whenGivenFirstNameStartWithCap_shouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message= userRegistration.firstName("Pranali");
        Assert.assertEquals("valid",message);
    }

    @Test
    public void whenGivenFirstName_ContainsMoreThanThreeCharacters_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.firstName("Pranali");
        Assert.assertEquals("valid",message);
    }

    @Test
    public void whenGivenFirstName_DoesNotStartsWithCapital_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.firstName("pranali");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenFirstName_ContainsLessThanThreeLetters_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.firstName("Pl");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenFirstName_HaveSecondLetterCapital_ShouoldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.firstName("PLqwdjb");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenLastNameStartWithCap_shouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message= userRegistration.lastName("Lembhe");
        Assert.assertEquals("valid",message);
    }

    @Test
    public void whenGivenLastName_ContainsMoreThanThreeCharacters_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.lastName("Lem");
        Assert.assertEquals("valid",message);
    }

    @Test
    public void whenGivenLastName_DoesNotStartsWithCapital_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.lastName("lembhe");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenLastName_ContainsLessThanThreeLetters_ShouldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.lastName("Pl");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenLastName_HaveSecondLetterCapital_ShouoldReturnInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.lastName("PLembhe");
        Assert.assertEquals("inValid",message);
    }
}
