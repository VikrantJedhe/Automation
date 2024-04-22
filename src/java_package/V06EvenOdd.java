package java_package;

import java.util.Scanner;

public class V06EvenOdd {
	
	public static void main(String[] args) {
		
		//Program 1
		/*
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st non-zero number ");
		int a= sc.nextInt();
	
		if(a%2==0)
		{
			System.out.println(a+ " is even number ");
		}
		
		else
		{
			System.out.println(a+ " is an odd number");
		}
		*/
		
		//Program 2  using ternary operator 
		//Syntax:         String  variable = (condition) ? expression1 : expression2  
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a non zero number");
		
		int b=sc.nextInt();
		
		String x= (b%2==0) ? "Even" : "Odd";
		
		System.out.println("Value of given  number "+b+ " is "+x);
		
		
	}

}
