package methodOverriding;

public class V01ClassB extends V01ClassA {
	
	
	
	public void info()
	{
		System.out.println("My name is Vikrant");
		System.out.println("I'm a Mechanical Engineer");
		
	}
	public void location()
	{
		System.out.println("I'm from Satara ");
		System.out.println("My village name is Saigaon");
	}
	public void currentLocation()
	{
		System.out.println("Currently i am living in Pune");
	}
	
	public static void main(String[] arges)
	{
		V01ClassB b=new V01ClassB();
		b.info();
		b.location();
		b.currentLocation();
	}

}
