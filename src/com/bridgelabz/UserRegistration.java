package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public static void toCheckForLastNameValidation(String LastName){
       
        boolean isLastName;
        String regexName = "^[A-Z]{1}[A-Z a-z]{3,}$";
        Pattern object = Pattern.compile(regexName);
        Matcher objectMatcher = object.matcher(LastName);
        isLastName = objectMatcher.matches();
        if(isLastName) {
            System.out.println(LastName + " is an valid name");
        }
        else{
            System.out.println(LastName + " is an invalid user name");
        }
    }
}