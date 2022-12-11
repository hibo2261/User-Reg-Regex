package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public static void toCheckForEmailValidation(String email){
        
            boolean isEmailId;
            String emailIdRegex ="^[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]$";//abc.xyz@bl.co.in
            Pattern patternObj = Pattern.compile(emailIdRegex);
            Matcher matcherObj = patternObj.matcher(email);
            isEmailId =  matcherObj.matches();

            if(isEmailId)
                System.out.println(email+" is a Valid Email Id\n");
            else
                System.out.println(email+" is a Invalid Email Id");
        }
}