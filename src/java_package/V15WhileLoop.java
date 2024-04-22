package java_package;

import java.util.Scanner;

public class V15WhileLoop {
	
	/*
	 Syntax:
	 initialization;
	 while (condition)
	 {
	 block of code;
	 Increment decrement;
	 } 
	*/
	//Print 1 to n numbers
	
	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter given number");
	 int n = sc.nextInt();
	 
	 int i=1; // initialization
	 
	 while (i<= n) // condition
	 {
		 System.out.println(i);
		 i++;
	 }
	 
	 
	 
	}

}
