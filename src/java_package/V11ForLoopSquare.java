package java_package;

public class V11ForLoopSquare {
	
	public static void main(String[] args)
	{
		int a = 5;
		
		for (int i= 1; i<=a; i++)
		{
			for(int j=1; j<=a-1; j++)
			{
				System.out.print("* ");
			}
			System.out.println("* ");
		}
	}

}
