
public class Array {
	
	public static void main (String [] args)
	{
		int [] arr= {5, 2, 1, 8};
		int temp=0;
		
		for (int item:arr)
		{
			System.out.println(item);
			
		}
		
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
		for (int item:arr)
		{
			System.out.println(item);
			
		}

	}
}
