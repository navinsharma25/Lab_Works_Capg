package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab_3_Exercise_1 {


	public static void main(String[] args)
	{
		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers with one space gap");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			num=Integer.parseInt(s);
			System.out.println(num);
			sum=sum+num;
		}
		System.out.println("Sum is "+sum);

	}

}
