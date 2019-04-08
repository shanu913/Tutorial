package com.program.practice;

public class SmallestinArray {
	
	public static void main (String[]args)
	{
		int a[]= {8, 9, 2, 1, 10};
		
		int len=a.length;
		
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(a[4]);
	}

}
