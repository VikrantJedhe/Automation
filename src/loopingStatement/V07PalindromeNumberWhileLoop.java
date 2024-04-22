package loopingStatement;

public class V07PalindromeNumberWhileLoop {

	public static void main(String[] args) {
		
		
		int originalNumber =2132;
		int temp=originalNumber;/* temp used to store original number because
		the original value is changing in loop*/
		int reverse= 0;
		
		while(originalNumber>0)
		{
			int a= originalNumber%10;
			
			reverse=(reverse*10)+a;
			
			originalNumber=originalNumber/10;
		}
		System.out.println("Te reverse number is "+reverse);
			
		if(temp==reverse)
		{
			System.out.println("The given number is palindrome: "); 
		}
		else
		{
			System.out.println("The given number is not palindrome: ");
		}
	}

}
