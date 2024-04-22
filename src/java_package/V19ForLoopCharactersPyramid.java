package java_package;

public class V19ForLoopCharactersPyramid {

	public static void main(String[] args) {
		
		char first= 'A';
		char last= 'E';
		
		for(char i=first; i<= last; i++ ) // Row
		{
			for(char k=i; k<=last ; k++ ) // Space
			{
				System.out.print(" ");
			}
			
			
			for(char j=first; j<= i; j++ ) // Column
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		// Reverse Order
		
	
//	 for(char i=first; i<= last; i++ )
//		{
//			for(char j=i; j<= last; j++ ) // Change in This line only
//			{
//				
//				System.out.print(j+" ");
//			}
//			
//			System.out.println();
//		}
//	 
			

	}

}
