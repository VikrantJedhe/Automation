package listener;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
@Listeners(listener.V02Implementation.class)
public class V02TestOrange {
	WebDriver driver;	
	@Test
	public void test1() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe\\");
	
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	}
	
	@Test (timeOut = 2000)
	public void test2() throws InterruptedException
	{
		V02POMOrange obj = new V02POMOrange(driver);
		Thread.sleep(5000);
		obj.sendUsername();
	Thread.sleep(3000);
		obj.sendPassword();
	Thread.sleep(3000);
	obj.clickLoginBtn();
	Thread.sleep(3000);
	
	}
	
	
	
	
	
	
}
	
