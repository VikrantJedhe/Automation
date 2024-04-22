package javaPrograms;

public class V10StarPattern {
	public static void main(String[] args) {
		int num=5;
		
		//Mirror right angle triangle * pattern
		for (int j=1;j<=num; j++)
		{
			for(int i=j;i<=num;i++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
