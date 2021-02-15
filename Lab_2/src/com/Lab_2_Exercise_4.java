package com;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_2_Exercise_4 {

	
	public static int removeDuplicate(int arr[])
	//Remove duplicates 
	{
		int j=0;
		int n=arr.length;
		int arr1[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr1[j++]=arr[i];
			}
		}
		arr1[j++]=arr[n-1];
		for(int k=0;k<j;k++)
		{
			arr[k]=arr1[k];
		}
		return j;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int num=sc.nextInt();
		int ar[]=new int[num];
		System.out.println("Enter the array elements");
		for(int i=0;i<num;i++)
		{
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		int result=removeDuplicate(ar);
		System.out.println("Array after removing duplicates: ");
		for(int i=0;i<result;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}

}

