package com.cg.eis.exception;

import java.util.Scanner;

public class Lab_5_Exercise_3 {
	static void Salary(int amt)throws EmployeeException
	{
		if(amt<3000)
		{
			throw new EmployeeException("not Accepted"); 
		}
		else
		{
			System.out.println("Accepted");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter salary of an employee :");
		n=sc.nextInt();
		try
		{
			Salary(n);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
	}
}
class EmployeeException extends Exception
{
	EmployeeException(String s)
	{
		super(s);
	}
}
