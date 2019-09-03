package com.program.practice;

import java.util.Scanner;

public class SwapWT {
	
	public static void main(String[] args)
	{
		int x, y;
		System.out.println("Enter value of x and y");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swapping the no: " + "x: " + x  + "y: " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping " + " x: " +x + " y: " +y);
	}

}
