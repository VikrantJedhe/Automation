package loopingStatement;

public class V08PrimeNumber {

	public static void main(String[] args) {
		
		int givenNumber=31;
		int a=0;
		
		for(int i=2;i<givenNumber;i++)
		{
			if(givenNumber%i==0)
			{
				a=a+1 ;
			}
		}
		
		if(a==0)
		{
			System.out.println("Prime");
		}
		if(a!=0)
		{
			System.out.println("Not Prime");
		}
	}

}
