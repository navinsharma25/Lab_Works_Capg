package com;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_2_Exercise_1 {
	
	public void getSecondSmallest(int arr[]) 
	//Get the second smallest element in the array
	{
		Arrays.sort(arr);
		System.out.println("The Second Smallest number in the array is : "+arr[1]);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the items for the array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		Lab_2_Exercise_1 obj=new Lab_2_Exercise_1();
		obj.getSecondSmallest(arr1);

	}

		}  