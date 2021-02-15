package com;

import java.util.Scanner;

public class Ex_7 {

	public static boolean checkNumber(int number) {
		//int number = 0;
		 int currentDigit = 0;
	       boolean flag = false;
			/*
			 * int currentDigit = number%10; number = number/10;
			 */
	       while(number>0){  
			if(currentDigit <= number % 10){
	               flag = true;
	               break;
	           }
	           currentDigit = number % 10;
	           number = number/10;
	       }
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	       System.out.println("Enter a number : ");
	       int number = s.nextInt();
	       System.out.print(checkNumber(number));
		
	}
}

