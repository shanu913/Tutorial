//  Check prime no or not

package com.program.practice;

public class PrimeNo {

	public static void main(String[] args) {
		int a= 8;
		int count=0;
		for(int i=1; i<=a; i++)
		{
				
				if(a%i==0)
				{
				count++;	
				}
			}
		if(count==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println(" not prime no");
	
		}
	}
}