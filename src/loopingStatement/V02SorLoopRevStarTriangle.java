package loopingStatement;

public class V02SorLoopRevStarTriangle {

	public static void main (String[] args)
	{
		//reverse triangle star pattern
	
	int a=5;
	
	for(int i=1; i<=a;i++) //for column
	{
		for(int k=1;k<=i;k++) //for space
		{
			System.out.print(" ");
		}
		
		for(int j=5; j>=i; j--)//for row
		{
			System.out.print("* ");
			
		}
		System.out.println("");
	}
	
}
}