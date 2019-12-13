package com.program.practice;

public class Arraysum {

	public static void main(String args[]) {
		int sum=0;
		int arr[]= {4,2,4};
		
		int len=arr.length;
		System.out.println(len);
		
		for(int i=0; i<len; i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum of array is " + sum);
		

	}
}
