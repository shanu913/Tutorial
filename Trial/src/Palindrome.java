import java.util.Scanner;

public class Palindrome {
	

	public static void main(String args[]) 
	{
		String original,s=""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
		{
			char ch= original.charAt(i);
			
			 s=String.valueOf(ch);
			
		}
		 
		if (original.equals(s))
		{
			
			System.out.println("Entered string/number is a palindrome.");
		}
		else
		{
			
			System.out.println("Entered string/number isn't a palindrome.");
		}
		
		in.close();
		
		
	}
}