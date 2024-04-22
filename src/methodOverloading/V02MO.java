package methodOverloading;

import java.util.Scanner;

public class V02MO {

	//Method overloading  using static method
	
	
	
	public static void substraction(int a, int b)
	{
		int c= a-b;
		System.out.println("The substraction of two numbers is "+c);
	}
	public static void substraction(int a,int b, int c)
	{
		int d=a-b-c;
		System.out.println("The substraction of three numbers is "+d);
	}
	
	public static void main(String[] args) {
		
		V02MO.substraction(30, 20);
		V02MO.substraction(45, 20, 10);
		
	}
}
