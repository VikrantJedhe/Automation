package loopingStatement;

public class V06FibonacciSeries {
//First 10 Fibonacci numbers
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int count=10;
	System.out.println("Fibonacci series for first "+count+ " number is :");
		
		for(int i=1; i<=count; i++)
		{
			int c=a+b;
			System.out.println(""+a);
			a=b;
			b=c;
		
		}
		

	}

}
