package java_package;

public class V18ForLoopNumbersPyramid {

	public static void main(String[] args) {
		
		
		int n =5;
		
		for (int i=1; i<=n; i++) // Row
		{
			for (int k=i; k<=n; k++)// Space
			{
				System.out.print(" "); 
			}
			
			for (int j=1; j<=i; j++)// Column
			{
				System.out.print(j+" "); //Print j
			}
			
			System.out.println();
		}

	}

}
