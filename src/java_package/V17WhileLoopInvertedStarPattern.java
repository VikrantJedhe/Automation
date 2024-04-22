package java_package;

import java.util.Scanner;

public class V17WhileLoopInvertedStarPattern {

	public static void main(String[] args) {
		
	/*	
	 Syntax:
	 	initialization
	 	while (condition)
	 	{block of code;
	 	inc/ dec ;}
	 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int n= sc.nextInt();
		
		int i=1; // Row
		
		while (i<=n) 
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
				System.out.print(i+ " ");
				j++;
			}
			
			System.out.println();
			i++;
		}
	}

}
