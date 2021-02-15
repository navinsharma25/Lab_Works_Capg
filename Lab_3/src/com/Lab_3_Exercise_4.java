package com;

import java.util.Scanner;

public class Lab_3_Exercise_4 {

	public void modifyNumber(int arr[])
	//Accepts a number and modify it as per the requirement 
	{
		int n=arr.length;
		int diff=0;
		for(int i=0;i<arr.length-1;i++)
		{
			diff=Math.abs(arr[i]-arr[i+1]);
			System.out.print(diff);
		}
		System.out.print(arr[n-1]);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int num=sc.nextInt();
		int arr1[]=new int[num];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}

		Lab_3_Exercise_4 obj=new Lab_3_Exercise_4();
		obj.modifyNumber(arr1);	
	}
}
