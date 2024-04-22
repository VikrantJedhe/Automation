package javaPrograms;

public class V03NestedIfStatement {
	public static void main(String[] args) 
	{
		//HW: Program To Find Smaller Numbers
		
		int a = 35;
		int b = 25;
		int c = 20;
		
		if (a<b)
		{	
			if (a<c)
			{System.out.println("A is Smaller");}
			else
			{System.out.println("C is Smaller");}
		}
		else
		{
			if (b<c)
			{System.out.println("B is Smaller");}
			else
			{System.out.println("C is Smaller");}
					
		}		
	}
}
