package methods;

public class V01Calculator {
	//Non Static Method
	//With return type Without argument 
	
	public int addition()
		{
		int a=10;
		int b=20;
		int c= a+b;
		return c;
		}
	public static void main(String[] args)
	{
		V01Calculator obj = new V01Calculator();
		int a=obj.addition();
		System.out.println("The Addition is" +a);
	}
}
