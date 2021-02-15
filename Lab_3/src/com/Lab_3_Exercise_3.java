package com;
import java.util.Scanner;
public class Lab_3_Exercise_3 {

	static boolean isVowel(char ch)
	//Replace consonants 
	{
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')  
        { 
            return false; 
        } 
		else
		{
			return true;
		}
	}
	static String alterString(char str[])
	{
		for (int i = 0; i < str.length; i++) 
        { 
            if (!isVowel(str[i])) 
            { 
                if (str[i] == 'z')  
                { 
                    str[i] = 'b'; 
                } 
                else
                {
                    str[i] = (char) (str[i] + 1);  
                    if (isVowel(str[i]))  
                    { 
                        str[i] = (char) (str[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(str); 
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value: ");
		String str=sc.nextLine();
		char str1[]=str.toCharArray();
		System.out.println("The altered string is: ");
		System.out.println(alterString(str1));

	}
}
