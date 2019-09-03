// Prime no between two no

package com.program.practice;

public class PrimeNo {

	public static void main(String[] args) {
		int num=7;
		int count=0;
		for(int i=1; i<=num; i++)
		{
				if(num%i==0)
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