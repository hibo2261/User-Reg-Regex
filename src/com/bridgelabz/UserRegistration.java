package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void toCheckPasswordValidation(String password){
        

            boolean isPassword;
            
            String mobileNumberRegex = "^[A-z a-z]{8}$";
            
            Pattern obj = Pattern.compile(mobileNumberRegex);
            
            Matcher matcherObj = obj.matcher(password);
            
            isPassword =  matcherObj.matches();

            
            if(isPassword)
                System.out.println(password+" is a Valid  password\n");
            else
                System.out.println(password+" is a Invalid  password");

        }
}