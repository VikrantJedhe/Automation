package multilineInheritance;

public class Subclass1 extends Superclass {
	
	public void AddMoney(String BankName,int Amount) 
	{
		System.out.println("Enter Bank Name: " +BankName);
		System.out.println("Enter Amount" +Amount);
		System.out.println(Amount+" Amount is added in wallet successfully");
	}

}
