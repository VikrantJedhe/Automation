package java_package;

public class V07NestedIfElse {
	
	public static void main(String[] args)
	{
			// Program To Find Greater Numbers
	int a,b,c;
	
	a=28; b=83; c=976;
	
	if (a>b)

	{
		if(a>c)
		{
			System.out.println("a is a greater number");
		}
		
		else 
		{
			System.out.println("c is a greater number");
		}
	}
	
	else
	{
		if (b>c)
		{
			System.out.println("b is greater number");
		}
		else
		{
			System.out.println("c is the greater number");
		}
		
	}
	}
}