package multipleInterface;

public class Gpay implements Sbi,Hdfc,Icici {

	public void sendMoney() //implemented method
	{
		System.out.println("Payment transfer by using Gpay");
		
	}
	

}
