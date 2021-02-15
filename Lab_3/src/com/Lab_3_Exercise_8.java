package com;

import java.util.Scanner;

public class Lab_3_Exercise_8 {

	public static boolean positiveOrNegative(String str)
	{
		int n = str.length(); 	  
        for (int i = 1; i < n; i++) 
        {
        	if (str.charAt(i) < str.charAt(i - 1)) 
        	{ 
                return false;
        	}
        }
        return true;
	}

	public static void main(String[] args) 
	{		
		  String s; 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the string to be checked :");
		  s=sc.next();
		 
		if (positiveOrNegative(s)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
	}

}

