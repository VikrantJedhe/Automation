package array;

public class V04EvenOddNumbers {
	public static void main (String[] arges)
	{
		int a[]= {2,4,5,6,7,14,25,27};
		int x= a.length;
		
		System.out.println("The even numbers in array are");
		for(int i=0; i<x; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(+a[i]);
			}
			
		}
		
		System.out.println("The odd numbers in array are");
		for(int i=0;i<x;i++)
		{
			if(a[i]%2!=0)
			System.out.println(a[i]);
		}
		
	}
	
	

}
