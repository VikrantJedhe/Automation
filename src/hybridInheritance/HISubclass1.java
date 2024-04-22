package hybridInheritance;

public class HISubclass1 extends HISuperclass {

	public void StMarks(int eng, int mar,int math)
	{
		System.out.println("The marks obtained :");
		System.out.println("English = "+eng);
		System.out.println("Marathi = "+mar);
		System.out.println("Mathematics = "+math);
	}
	
	/*public static void main (String[] args)
	{
		HISubclass1 hi = new HISubclass1();
		hi.studentinfo("Vicky", "Jedhe", 007);
		hi.StMarks(90, 75, 95);
			
	}*/
}