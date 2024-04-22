package methodOverloading;

public class V01MO {
	//Non static method overloading
	
	public void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers is "+c);
	}
	
	public void addition(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("Addition of 3 numbers is "+d);
	}
	
	public static void main(String[] args) {
		
		V01MO mo= new V01MO();
		
		mo.addition(10, 20);
		mo.addition(21, 20, 40);
		
	}

}
