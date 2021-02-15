package com;

import java.util.Scanner;

public class Ex_5 {
	static int calculateSum(int n){
		//Calculate Sum
		int sum=0;int i=0;int j=0;
		for(i=0;;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
				j++;
			if(j==n+1)
				break;
			}			
}
		return sum;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number  : ");
		int n = s.nextInt();	
		System.out.println(calculateSum(n));
	}

}
