import java.util.Scanner;

public class Sum {
	
	public static void main(String args[])
    {
        int m, n, sum = 0;
        //Scanner s = new Scanner(System.in);
        //System.out.print("Enter the number:");
        m = 544;
        //while(m > 0)
        	
        for (int i=0; i<m; i++)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}


