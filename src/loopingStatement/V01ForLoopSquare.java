package loopingStatement;

public class V01ForLoopSquare {
	public static void main (String[] args)
	{
	//Symmetrical star triangle
		
		for(int i=1; i<=5;i++) //for row
				{
					for(int k=5; k>=i; k--) //for space
					{
					System.out.print(" ");  
					}
					
					
					for(int j=1; j<=i; j++) //for column
					{
						System.out.print(" *");
					}
					
			
					System.out.println("");
					
				}
		
	}
}