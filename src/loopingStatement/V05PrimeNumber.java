package loopingStatement;

public class V05PrimeNumber {

	public static void main(String[] args) {
		// WAP to check given number is Prime or not	
		int number=1;
		int a=0;
		 
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				a++; // or we can use a+1
			}	
		}
		
		if(a==0)
		{
			System.out.println("Given number is prime number");
		}
		else
		{
			System.out.println("Given Number is not a prime number");
		}
	}

}
