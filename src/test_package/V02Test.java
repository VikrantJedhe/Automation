package test_package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class V02Test {
	
	WebDriver driver;
	
	@Test
	public void test1()
	{
		System.out.println("Pass 1");
	}
	
	
	@Test
	public void test2() throws InterruptedException
	{
		 driver= Utility.LaunchChrome();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		String OriginalUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		
		if (url.equals(OriginalUrl)) 
		{
			System.out.println("Test has Passed");
		}
		else 
		{
			System.out.println("Test has Failed");
		}
		
	} 
	
	@Test
	public void Test3() throws InterruptedException
	{
		
		ChromeOptions Options = new ChromeOptions(); // Launch browser
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\All Drivers\\chromedriver.exe");
		 driver = new ChromeDriver(Options);

		Thread.sleep(2000);
		
		Dimension d= new Dimension(400,600); // To change size of Browser
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		Point p = new Point(400,800); // To set Position of browser window
		
		driver.manage().window().setPosition(p);
		
		
	}
	
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
}
