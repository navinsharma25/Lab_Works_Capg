package com;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number upto which prime number is to be printed : ");
		int num=s.nextInt();
		
        for (int i = 2; i <= num; i++)
        {
            boolean isPrime = true;
            for (int j=2; j <=i/2; j++)
            {
                if ( i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime == true )
                System.out.print(i+"\t");
        }
	}
}
