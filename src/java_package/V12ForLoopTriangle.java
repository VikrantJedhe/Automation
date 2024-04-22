package java_package;

public class V12ForLoopTriangle {

	public static void main(String[] args) {
	
		
		int a= 5;
		// loop to iterate for the given number of rows 
		for(int i=1; i<=a; i++)
		{
			// loop to print the number of spaces before the star 
			for(int k=a; k>=i; k--)
			{
				System.out.print("");   //Very IMP Space for 3 patterns
			}
			// loop to print the number of stars in each row 
			for( int j=1; j<=i; j++)
			{
				System.out.print(" *");
			}
			// for new line after printing each row 
			System.out.println();
		}
		
		
		
	}

}
