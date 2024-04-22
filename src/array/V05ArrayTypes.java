package array;

public class V05ArrayTypes {
	
	//Array declaration methods
	
	public static void main (String[] arges)
	{
		int a[] = new int[5];// size of array is 5 Array declaration
		//index is 4
		a[0]=15;// Array initialization
		a[1]=24;
		a[2]=42;
		a[3]=74;
		a[4]=87;
		
		System.out.println("the value of a at index 2 is "+a[2]);
		System.out.println("the value of a at index 4 is "+a[4]);
		
		int b[]= {10,20,30,40};//Array initialization and declaration together
		System.out.println();
		int size= b.length;
		for(int i=0; i<size; i++)
		{
			System.out.println("The value of b is " +b[i]);
		}
	}

}
