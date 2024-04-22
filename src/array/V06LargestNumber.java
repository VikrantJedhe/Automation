package array;

public class V06LargestNumber {

	public static void main(String[] args) {
		
		int a[]= {10,25,47,42,8};
		int size=a.length;
		
		int max=10;
		int min=25;
		
		for (int i=0; i<size; i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		System.out.println("Max value is "+max);
		
		for (int i=0;i<size;i++)
		{
			if(a[i]<=min)
			{
				min=a[i];
			}
		}
		System.out.println("Min value is "+min);

	}

}
