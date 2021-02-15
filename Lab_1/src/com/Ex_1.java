package com;

import java.util.Scanner;

public class Ex_1 {
	public void sumCubesOfDigits()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=s.nextInt();
		int len=String.valueOf(number).length();
		int sum=0,n;
		while(number!=0) {
			n=number%10;
			sum=sum+(n*n*n);
			number=number/10;
			}
		System.out.println("The sum of the Cubes of the Digits are : "+sum);
		
	}
	public static void main(String[] args) {
		Ex_1 E=new Ex_1();
		E.sumCubesOfDigits();
		
	}

}
