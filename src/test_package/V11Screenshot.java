package test_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V11Screenshot {
	
	WebDriver driver;
	
	public void screenshot(WebDriver driver, String Name) throws IOException, InterruptedException
	{
		//File Source ,File Desination, FileHandler.copy(Source, Destination)
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("F:\\Selenium Screenshots\\"+Name+".jpg");
		FileHandler.copy(source, dest);	
	}
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		driver= new ChromeDriver(Options);

		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void openWebpage() throws IOException, InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		V11Screenshot obj= new V11Screenshot();
		
		obj.screenshot(driver, "fbTestNg1");
	}
	
	

	
	@AfterTest
	public void Tearup() throws InterruptedException
	{
		Thread.sleep(3000);
		if (driver!=null)
		{
			driver.quit();
		}
	}

}
