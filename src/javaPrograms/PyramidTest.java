package javaPrograms;

public class PyramidTest {

	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 1; i <= n; i++)
		{
         
            for (int k = 1; k <= n - i; k++)    // Print spaces
            {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) // Print increasing numbers
            {
                System.out.print(j + " ");
            }
         
            for (int j = i-1 ; j >= 1; j--)    // Print decreasing numbers
            {
                System.out.print(j + " ");
            }
            System.out.println();
        
		}
	}

}
