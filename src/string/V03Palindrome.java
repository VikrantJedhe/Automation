package string;

public class V03Palindrome {

	public static void main(String[] args) {
		
		String a="Vikrant";
		int b=a.length();
		System.out.println("The length of String is "+b);
		
		String reverse="";
		
		for (int i=b-1; i>=0; i--)
		{
			char ch =a.charAt(i);//to print characters in reverse
			reverse=reverse+ch;//to make string from reverse characters
		}
		System.out.println("The original string is "+a);
		System.out.println("The new string is "+reverse);
		
		if(a.equals(reverse))
		{
		System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
	}

}
