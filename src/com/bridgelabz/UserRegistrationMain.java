package com.bridgelabz;

import java.util.Scanner;


public class UserRegistrationMain {
   
	public static void main(String[] args){
        
		Scanner sc = new Scanner(System.in);
       
		UserRegistration user = new UserRegistration();
        
		System.out.println("Welcome to the User Registration System");

       
		System.out.println("Please Enter the lastName:");
       
		String LastName = sc.nextLine();
       
		user.toCheckForLastNameValidation(LastName);//UC2




    }
}