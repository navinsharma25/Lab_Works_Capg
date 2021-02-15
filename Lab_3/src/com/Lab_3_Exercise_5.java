package com;

import java.util.Scanner;

public class Lab_3_Exercise_5 {

	public void count(String str)
	{
		char[] ch = str.toCharArray();
		int ctr=0;
        for (int i = 0; i < ch.length; i++) 
        {
        	String s = "";
        	while (i < ch.length && ch[i] != ' ')
        	{ 
                s = s + ch[i]; 
                i++; 
            } 
        	if (s.length() > 0)
        		ctr=ctr+s.length();
                
        }
        System.out.println("No of Characters: "+ctr);
	}
	public static int word(String str)
	{
		if (str == null || str.isEmpty()) 
            return 0;
		 String[] words = str.split("\\s+");
		 return words.length; 
	}

	public static void main(String[] args) {
		String str ; 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string :");
		str=s.next();
		Lab_3_Exercise_5 obj=new Lab_3_Exercise_5();
        obj.count(str);
        System.out.println("No of words : " + 
                word(str));

	}

}
