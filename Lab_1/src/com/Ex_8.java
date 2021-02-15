package com;

import java.util.Scanner;

public class Ex_8 {
		
		static boolean checkNumber(int n)
		{
		    if(n==0)
		    return false;
		 
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
		       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		}
		 
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number to be checked : ");
			int n = s.nextInt();
		    if(checkNumber(n))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
		}