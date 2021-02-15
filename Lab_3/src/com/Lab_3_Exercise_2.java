package com;

import java.util.Scanner;

public class Lab_3_Exercise_2 {
	public void getImage(String str)
	//Generate the mirror image of a String and add it to the existing string
	{	
		StringBuilder sb=new StringBuilder(str);
		StringBuilder s=sb.reverse();
		System.out.println("String Image ");
		System.out.println(str+"|"+s);		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String ss=sc.nextLine();

		Lab_3_Exercise_2 obj=new Lab_3_Exercise_2();
		obj.getImage(ss);
	}
}
