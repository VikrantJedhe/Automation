package javaPrograms;

public class V08StarPattern {
	public static void main(String[] args)
	{
		int a=1;
		int b=5;
		//* Rectangle Pattern
		for(int j=1; j<=b; j++) //Row
		{
			
			for(int i=5; i>=a; i--) //Column
				{
		
				System.out.print(" *");
				
				}
			System.out.println(); //Space
			}
	}

}
