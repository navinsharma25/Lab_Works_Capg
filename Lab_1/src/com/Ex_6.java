package com;

import java.util.Scanner;

public class Ex_6 {
	public static int calculateDifference(int n){
	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
	      int sumN = (n * (n + 1)) / 2;
	      int squareSumN = sumN * sumN;
	      return Math.abs(sumSquareN - squareSumN);
	   }
	   public static void main(String args[]){
		   Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number  : ");
			int n = s.nextInt();
	      System.out.println("Number: " + n);
	      System.out.println("Difference: " + calculateDifference(n));
	   }
	}
