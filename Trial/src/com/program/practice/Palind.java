package com.program.practice;

import java.util.Scanner;

public class Palind 
{
	public static void main(String[]args)
	{
		String original, rev="";
		
		System.out.println("Enter string:");
		
		Scanner sc=new Scanner (System.in);
		
		original=sc.nextLine();
		int len=original.length();
		
		for(int i=len-1; i>=0; i-- )
		{
			rev=rev+original.charAt(i);
		}
		
		if(original.equals(rev))
		{
			System.out.println("Palindrom");
			
		}
		
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
