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

    @Test
    public void whenGivenEmail_ContainsOnlyThreeMandatoryParts_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message=userRegistration.emailId("pranali@gmail.com");
        Assert.assertEquals("valid",message);
    }

    @Test
    public void whenGivenEmail_ContainsAllParts_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.emailId("pranali.lembhe@bridgelabz.com.in");
        Assert.assertEquals("valid",message);
    }

    @Test
    public void whenGivenEmail_StartsWithDot_ShouldReturnInValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.emailId(".lembhe77@gmail.com");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenEmail_ContainsMoreThanThreeCharactersForCountryCode_shouldReturnInValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.emailId("pranali.lembhe@gmail.asddf");
        Assert.assertEquals("inValid",message);
    }


    @Test
    public void whenGivenMobileNumber_ContainsTenDigits_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.mobileNumber("+91 9876543210");
        Assert.assertEquals("valid",message);
    }
    @Test
    public void whenGivenMobileNumber_DoNotContainsSpaceBetweenCountryCodeAndNumber_ShouldReturnInValid_() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.mobileNumber("+911234567890");
        Assert.assertEquals("inValid",message);
    }
    @Test
    public void whenGivenMobileNumber_ContainsLessThanTenNumbers_ShouldReturnInValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.mobileNumber("+91 123456");
        Assert.assertEquals("inValid",message);
    }
    @Test
    public void whenGivenMobileNumber_DoNotContainCountryCode_ShouldReturnInValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message =userRegistration.mobileNumber("8888888888");
        Assert.assertEquals("inValid",message);
    }

    @Test
    public void whenGivenPassword_HaveMinimumEightCharacters_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String message = userRegistration.passWord("pranalilembhe");
        Assert.assertEquals("valid",message);
    }


}
