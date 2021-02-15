package com;

import java.time.LocalDate;
import java.time.Period;

public class Lab_3_Exercise_9 {

//accept date and print the duration in days, months and years with regards to current system date

	public static void main(String[] args) 
	{
		
		LocalDate pdate = LocalDate.of(2021, 02, 14);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.printf("\nDifference is %d years, %d months and %d days\n\n",
        		diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
