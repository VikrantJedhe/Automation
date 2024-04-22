package array;

public class V03ForLoopInArray {
	static int number;
	static int t1;
	public static void main (String[] args)
	{
		int a[]= {1,2,3,4,5,6,67,23,47,97,98};
		
		int x= a.length;
		System.out.println("Size of array is " +x);
				
		for(int i=0;i<x;i++)
		{
			number=a[i];
		
		System.out.println("The value at index " +i+ " is "+number);
		int temp=0;
			for(int j=2;j<number;j++)
			{  
				if (number%j==0)
				{
					temp=temp+1;
				}	
			}
			
			if(temp==0)
			{
				System.out.println("Given number is prime number");
			}
			
			else
			{
				System.out.println("Given Number is not a prime number");
			}	
		}	
	}	
}