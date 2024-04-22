package testPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack1.Google1;

public class GoogleTest1 {

	WebDriver driver;
	
	@BeforeMethod
	
	public void launchBrowser()
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		driver = new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void openWebpage() throws InterruptedException
	{
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
	}
	
	@Test
	public void search() throws InterruptedException
	{
		// To open Webpage
		openWebpage();
		// To access Pom class methods
		Google1 obj = new Google1(driver);
		
		obj.sendInput("buy iphone 12 from flipkart");
		Thread.sleep(3000);
		
		obj.clickFlipkart();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);

	if (driver != null)
	{
		driver.quit();
	}
	}
	
}
