package com.program.practice;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args)
	{
	
	String original, reverse="";
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your input:");
	original=sc.nextLine();	
	
	int length=original.length();
	
	for(int i=length-1; i>=0; i--)
	{
		reverse=reverse+original.charAt(i);
	}
	
	System.out.println(reverse);
			
	}

}