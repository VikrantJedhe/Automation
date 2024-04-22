package javaPrograms;

import java.util.Scanner;

public class V12DrivingLicence {
	

	public static void main (String[] arges)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int age= sc.nextInt();
			
		if(age>=18)
		{
			System.out.println("Have you pass the driving test (yes/no)");
			String result= sc.next();
			
			if (result.equals("yes"))
			
			{
				System.out.println("You will get driving license");
			}
	
			else if(result.equals("no"))
			{
				System.out.println("Please pass the driving test ");
			}
			else 
			{
				System.out.println("Enter valid input");
			}
			
		}
		else
		{
			System.out.println("You are not eligible for driving license");
		}	
		
	}
	

}
