package java_package;

import java.util.Scanner;

public class V22DrivingLicenceTest {
	
	//Program to get driving License
	//Criteria: Eligible, Pass / Fail
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your age");
		
		int age= sc.nextInt();
		  
		
		if(age>=18 && age<=60)
		{
			System.out.println("You are eligile for driving test");
			
			System.out.println(" Have you passed Driving test (yes/ no)");
			
			String result= sc.next();
			
			if(result.equals("yes"))
			{
				System.out.println("You will get Driving License");
			}
			else if (result.equals("no"))
			{
				System.out.println(" Please pass a Driving test");
			}
			else 
			{
				System.out.println("Please enter valid input");
			}		
		
		}
		else 
		{
			System.out.println("You are not eligible for driving test");
		}
	}
	
	
	
	
}
