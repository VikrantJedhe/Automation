package constructor_demo;

public class V01Demo {

	
	V01Demo()
	{
		int a =10, b=20, c=a+b;
		
		System.out.println("Addition is "+c);
		
	}
	
	V01Demo(int x, int y) // no need to add access specifier for constructor
	{
		int z = x+y;
		
		System.out.println("Addition is " +z);
	}
	
	V01Demo(String Name)
	{
		System.out.println("Name of person is " +Name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			V01Demo obj1 = new V01Demo(); // Zero Argument Constructor
			
			V01Demo obj2 = new V01Demo(20,30); // Parameterized Constructor
			
			V01Demo obj3 = new V01Demo("Vikrant");
			
			obj3= new V01Demo();
	}

}
