package javaPrograms;

import java.util.Scanner;

public class T8IfElseUIScanner {
	public static void main(String[] args) 
	{
		//HW : Program To Find Odd Even Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a non zero number");
		int a=sc.nextInt();
		
		
			if (a%2==0)
			{
				System.out.println("The given number is even" +a);
			}
			else
				{
				System.out.println("The given number is odd" +a);
				}
		
	}

}
