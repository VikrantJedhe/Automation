package string;

public class V01EqualstoAndEqualsFunction {

	public static void main(String[] args) {
		
		String a= "Vikrant";
		String b= "Vikrant";
		
		String c= new String("Vikrant"); 
		//new String("") used to store value at new memory location
		
		boolean x=(a==b); //same memory location
		System.out.println(x);
		boolean y=(a==c);// different memory location
		System.out.println(y);
		//== is relational operator used for address comparison 
		
		boolean z=(a.equals(b));
		System.out.println(z);
		boolean w=(a.equals(c));
		System.out.println(w);
		//equals.() function is used for content comparison
	}

}
