import java.util.Scanner;

public class Test 
{
	public static void main (String [] args)
	{
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			System.out.println("enter value "+i+".....");
			 a [i]=s.nextInt();
		}
		
		for(int aa:a)
		{
			System.out.println(aa);
		}
			
		s.close();
	}
}
