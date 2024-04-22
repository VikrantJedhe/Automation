package methods;

public class V04Calculator {
	//Non Static method
	// With return type with argument
	public int division(int a,int b)
	{
		int c= a/b;
		return c;	
	}


public static void main(String[] args)
	{
	V04Calculator cal= new V04Calculator();
	
	int x=cal.division(40,2);
	
	System.out.println("The division is "+x);
	}
	
}