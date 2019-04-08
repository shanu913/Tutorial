package com.program.practice;

public class ArraySort {

	public static void main (String [] args)
	{
		int a[]= {7, 8, 1, 10};
		int temp;
		
		System.out.println("Before sorting");
		
		int len=a.length;
		
		for(int item:a)
		{
			System.out.println(item);
		}
		
		for(int i=0; i<len; i++)
		{
			for (int j= i+1; j<len; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}	
			}
		}
		
		System.out.println("After sorting");
		
		for(int item:a)
		{
			System.out.println(item);
		}
	}
	
}
