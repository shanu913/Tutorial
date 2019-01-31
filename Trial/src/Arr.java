
//Smallest element in an array

public class Arr {
	
	public static void main (String [] args)
	{
		int temp;
		int a [] = {8, 9, 145, 1, 80};
		int size= a.length;
		for (int i = 0; i < size; i++)   
		        {  
		            for (int j = i + 1; j < size; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }
		                }
		            }
		System.out.println(a[0]);
		}
	}  
		           