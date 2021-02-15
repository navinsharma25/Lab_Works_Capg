package com.cg.Exception;

import java.util.Scanner;

public class Lab_5_Exercise_1 extends Exception { 
	 public Lab_5_Exercise_1(String s) {
	  System.out.println(s);
	 }
	public static void main(String[] args) {	
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		age=sc.nextInt();
		sc.close();
		try {
			if(age<16)
				throw new Lab_5_Exercise_1("INVALID AGE...!!! Age should be above 15");
			else
				System.out.println("Valid age");	
		}	
		catch(Lab_5_Exercise_1 e)
		{
			System.out.println(e);
		}		
	}
}
