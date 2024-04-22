package java_package;

public class V16WhileLoopStarPattern {

	public static void main(String[] args) {
		
		
		int n= 5;
		
		int i=1;
		while (i<=n) // Row
		{
			int k=i; // Space
			while (k<=n)
			{
				System.out.print(" ");
				k++;
			}
			
			int j=1; // Column
			while (j<=i)
			{
				System.out.print(" *");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		
	}

}
