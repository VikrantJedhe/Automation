package java_package;

public class V20DoWhileLoop {
	
	public static void main(String[] args)
	{
		//Print 1 to 10 numbers using do while loop
		
		/* Syntax:
		 
		  initialization
		  do
		  { Block of code;
		  inc/ dec; }
		  while (condition)
		 */
		
		int n =10;
		
		int i=1; // initialization;
		do // do
		{
		System.out.println(i);	// Block of code
		i++; //increment/ decrement
		}
		while (i<=n); // while
		
	}

}
