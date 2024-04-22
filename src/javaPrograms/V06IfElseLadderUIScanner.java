package javaPrograms;

import java.util.Scanner;

public class V06IfElseLadderUIScanner {
public static void main(String[] args)
	
	//HW : 12Program for bigger number using scanner
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the 1st number");
	int a= sc.nextInt();
	
	System.out.println("Enter the 2nd number");
	int b= sc.nextInt();
	
	System.out.println("Enter the 3rd number");
	int c= sc.nextInt();
	
	System.out.println("Enter the 4th number");
	int d= sc.nextInt();
	
	if(a>b && a>c && a>d)
	{
		System.out.println(" The greater number is"+a);
	}
	
	else if(b>a && b>c && b>d)
		
	{System.out.println(" The greater number is"+b);
	}
	
	else if(c>a && c>b && c>d)
	{System.out.println(" The greater number is"+c);
	}
	
	else
	{System.out.println(" The greater number is"+d);
	
	
	}

}
}
