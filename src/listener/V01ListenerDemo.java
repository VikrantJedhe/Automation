package listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.V01Implementation.class)
public class V01ListenerDemo {

	@Test //(timeOut = 500)
	public void Test1() throws InterruptedException
		{
//		Thread.sleep(600);
		System.out.println(" Passed Test Case from -->Test1");
		}
	
	@Test(timeOut = 500)
	public void Test2() throws InterruptedException
	{
		Thread.sleep(600);
		System.out.println("Failed Test Case from -->Test2");

	}

}
