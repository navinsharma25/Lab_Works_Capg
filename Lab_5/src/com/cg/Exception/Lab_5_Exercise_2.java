package com.cg.Exception;

import java.util.Scanner;

public class Lab_5_Exercise_2 extends Exception {
	 
	 public Lab_5_Exercise_2(String s) {
	  System.out.println(s);
	 }
	public static void main(String[] args) {
		String firstName =new String();
		String lastName =new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name followed by last name :");
		firstName =sc.nextLine();
		lastName =sc.nextLine();
		sc.close();
		
		try {
			if(firstName.isBlank())
				throw new Lab_5_Exercise_2("First Name cannot be blank");
			else
				System.out.println("Valid First name");
			
			if(lastName.isBlank())
				throw new Lab_5_Exercise_2("Last Name cannot be blank");
			else
				System.out.println("Valid Last name");
		}		
		catch(Lab_5_Exercise_2 e)
		{
			System.out.println(e);
		}
	}
}