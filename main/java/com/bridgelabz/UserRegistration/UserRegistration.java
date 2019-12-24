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

    public String lastName(String lastName) {
        String pattern="^[A-Z]{1}[a-z]{2,}$";
        if (lastName.matches(pattern)) {
            return "valid";
        }
        else {
            return "inValid";
        }
    }

    public String emailId(String email) {
        String pattern="^[0-9a-zA-Z]+([.+_-]?[0-9a-zA-Z]+)*([@][0-9a-zA-Z]+){1}([.][a-zA-Z]{2,3}){1,2}$";
        if (email.matches(pattern)) {
            return "valid";
        }
        else {
            return "inValid";
        }
    }
    public String mobileNumber(String mobileNumber) {
        String pattern="^[+][0-9]{1,3}[ ]{1}[0-9]{5}[ ]?[0-9]{5}$";
        if (mobileNumber.matches(pattern)) {
            return "valid";
        }
        else{
            return "inValid";
        }
    }


    public String passWord(String passWordName) {
        String pattern="(?=.*[A-Z])(?=.*[a-z]).{7,}";
        if (passWordName.matches(pattern)) {
            return "valid";
        }
        else
        {
            return "inValid";
        }
    }
}
