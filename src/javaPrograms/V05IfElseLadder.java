package javaPrograms;

public class V05IfElseLadder {
	public static void main(String[] args) {
		//Home Work: Find Bigger Number Among given 3 Numbers
			int a=65;
			int b=423;
			int c=105;
			
			if(a>b && a>c)
			{
				System.out.println(a+ " Is biggeest number");
			
			}
			else if(b>a && b>c)
			{ 
				System.out.println(b+" Is biggest number");
			}
			
			else
			{
				System.out.println(c+ " Is biggest number");
			}
		
	}
}
