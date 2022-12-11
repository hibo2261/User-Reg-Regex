package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
   
    public static void toCheckForFirstNameValidation(String FirstName){
        
       
    	boolean isFirstName;
        String regexName = "^[A-Z]{1}[a-z A-Z]{3,}$";
        
        Pattern object = Pattern.compile(regexName);
        
            Matcher objectMatcher = object.matcher(FirstName);
       
            isFirstName = objectMatcher.matches();
        if(isFirstName)
        {
            System.out.println(FirstName + " is an valid name");
        }
        else
        {
            System.out.println(FirstName + " is an invalid user name");
        }
    }
}