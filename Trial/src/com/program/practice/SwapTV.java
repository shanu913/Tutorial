package com.program.practice;

import java.util.Scanner;

public class SwapTV 
{
	public static void main(String [] args)
	{
		
		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swapping the no" + " x: " +x + " y: " +y);
		
		temp=x;
		x=y;
		y=x;
		
		System.out.println("After swapping the no" + "x: " + x + "y: " +y);
		
	}
	
}

