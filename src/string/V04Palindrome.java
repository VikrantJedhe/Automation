package string;

import java.util.Scanner;

public class V04Palindrome {
	//WAP to reverse the string and then check it is palindrome or not
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Word");
		String a= sc.nextLine();
		int b=a.length();
		System.out.println("The length of string is "+b);
		
		String Reverse="";
		
	for (int i=b-1; i>=0; i--)
		{
		char ch;
		ch= a.charAt(i);
		Reverse=Reverse+ch;
		}
		System.out.println("The original String is "+a);
		System.out.println("The reverse String is "+Reverse);
		
	if(a.equals(Reverse))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is not a palindrome");
	}
	}

}
