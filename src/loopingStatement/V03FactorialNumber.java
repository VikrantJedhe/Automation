package loopingStatement;

public class V03FactorialNumber {

	public static void main(String[] args) {
		// WAP for Factorial Number
		
		int givennumber=4;
		int factorial=1;
		
		for(int i=1;i<=givennumber; i++)
		{
			factorial=factorial*i;
//i=1 then		f=1*1	new factorial become 1
//i=2 then		f=1*2   new factorial become 2
//i=3 then		f=2*3	new factorial become 6
//i=4 then		f=6*4	new factorial become 24			
		}
		System.out.println("The Factorial of Given Number Is "+factorial);
	}

}
