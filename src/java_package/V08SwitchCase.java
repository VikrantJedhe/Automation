package java_package;

import java.util.Scanner;

public class V08SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Expression");
			
		int expression=sc.nextInt();
	
		switch (expression)
		
		{
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Tursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Invalid Input");break;
		
		}
		
	/*
		Syntax:
		 
		 int expression = value;
		Switch (expression)
		{
		case value 1 : Syso ("output 1"); break;
		case value 2 : Syso ("output 2"); break;
		default: Syso("Invalid Input"); breaks;
		}
		
	*/	
		
		
	}
	
}
