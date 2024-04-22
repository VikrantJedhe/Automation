package java_package;

import java.util.Scanner;

public class V14ForLoopInvertedStar {
	
	// Example: Star pattern Inverted Symmetric triangle 
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size");
		int rows= sc.nextInt();
		
		for(int i=1; i<=rows; i++)// Rows
		{
			for(int k=1; k<= i;k++ )// Spaces
			{
				System.out.print(" ");
			}
				
			for(int j=i; j<=rows; j++)// Columns
			{
				System.out.print(" *");
			}
			
			
		System.out.println();
		}
		
		
		
		
		
	}

}
