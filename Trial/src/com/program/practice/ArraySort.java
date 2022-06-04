package com.program.practice;

import java.util.Arrays;

public class ArraySort {

	public static void main (String [] args)
	{
		int a[]= {7, 8, 1, 10};
		int temp;
		
		//System.out.println("Before sorting");
		//Arrays.sort(a);
		//System.out.println("After Sorting=" + Arrays.toString(a));
		
		int len=a.length;
		
		/*
		 * for(int item:a) { System.out.println(item); }
		 */
		
		for(int i=0; i<len; i++)
		{
			for (int j= i+1; j<len; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}	
			}
		}
		//System.out.println("Largest element=" + a[0]);
		//System.out.println("After sorting=" + Arrays.toString(a));
		
		for(int item:a)
		{
			System.out.println(item);
		}
	}
}

