package java_package;

public class V24PyramidUsingNumbers {

	public static void main(String[] args) {
		
		int n= 5;
		
		for(int i=1; i<=n; i++)
		{
			for(int k= n; k>=i; k--) //Spaces
			{
				System.out.print("  ");
			}
			
			for(int j= 1; j<=i; j++) // Increasing Numbers
			{
				System.out.print(j+" ");
			}
			
			for(int j= i-1; j>=1; j--) // Decreasing Numbers
			{
				System.out.print(j+" ");
			}
			
			
			System.out.println();
		}

}
}