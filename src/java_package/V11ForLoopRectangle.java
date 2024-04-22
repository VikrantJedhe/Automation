package java_package;

import java.util.Scanner;

public class V11ForLoopRectangle {

	public static void main(String[] args) {
		
		int Length, Width;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Length");
		Length=sc.nextInt();
		System.out.println("Enter Width");
		Width= sc.nextInt();
		
		for(int i=1; i<=Width; i++)
		{
			for(int j= 1; j<Length; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println("*");
		}
		
	}

}
