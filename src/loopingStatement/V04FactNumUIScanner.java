package loopingStatement;

import java.util.Scanner;

public class V04FactNumUIScanner {

	public static void main(String[] args) {
		// WAP to find Factorial number Using UI Scanner
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a non zero number");
		
		int num= sc.nextInt();
		long factorial=1;  //long data type used for large size memory
		
		for(int i=1; i<=num;i++ )
		{
			factorial=factorial*i; //Formula or logic
		}
		
		System.out.println("The factorial of given number is " +factorial);
	}

}
