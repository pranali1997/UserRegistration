package com.bridgelabz.UserRegistration;

public class UserRegistration {

    public String firstName(String firstName) {
        String pattern="^[A-Z]{1}[a-z]{2,}$";
        if (firstName.matches(pattern)) {
            return "valid";
        }
        else {
            return "inValid";
        }
    }
}
