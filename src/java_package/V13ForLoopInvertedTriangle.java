package java_package;

import java.util.Scanner;

public class V13ForLoopInvertedTriangle {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size");
		int rows =sc.nextInt();
		
		// inverted star pattern Example 2
		//logic: Outer loop prints rows Need 5 rows
		//Inner loop print columns, Need 5 columns in 1st row
		
		for( int i=1; i<=rows; i++)
		{
//			for(int j= rows; j>= i; j--)// OR 
			for(int j =i; j<=rows; j++)   
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}

	}

}
