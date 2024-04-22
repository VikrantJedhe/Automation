package constructor;

public class V01ConstructorDemo {

	V01ConstructorDemo()
	{
		int a=15;
		int b=25;
		int c=a+b;
		System.out.println("add is"+c );
	}
	
	V01ConstructorDemo(int a,int b)
	
	{
		int c=a-b;	
		System.out.println("Sub is"+c);
	}	
	
	V01ConstructorDemo(String name)
	{
		System.out.println("Name is"+name);
	}	
	public static void main(String[] args) {
		
		//ClassName obj= new ClassName(); for calling constructor
		
		V01ConstructorDemo obj1 =new V01ConstructorDemo();
		V01ConstructorDemo obj2 =new V01ConstructorDemo(10,5);
		V01ConstructorDemo obj3 =new V01ConstructorDemo("Construstor demo");
	}

}
