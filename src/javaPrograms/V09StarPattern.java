package javaPrograms;

public class V09StarPattern {
	public static void main(String[] args)
	{
		int a=5;
		
		//Right angle triangle * pattern
		for(int j=1; j<=a; j++) //Row
		{
			
			for(int i=1; i<=j; i++) //Column
				{
		
				System.out.print(" *");
				
				}
			System.out.println(); //Space
			}
	}

}
