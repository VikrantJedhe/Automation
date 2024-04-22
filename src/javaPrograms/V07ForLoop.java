package javaPrograms;

public class V07ForLoop {
	public static void main(String[] args) 
	{
		//* Rectangle Pattern
	int a=5;
	
	for(int i=1;i<=a;i++)  // When i=1 condition true & enter in 2nd for loop
	{
		for(int j=1;j<=a-1;j++) // J=1 to 5 condition true 5 times in loop
		{
			System.out.print("* "); // Print * 5 times in 1st row
		}
		
		System.out.println("*"); // Print * to next row and loop repeats
		
	}
	

}
}