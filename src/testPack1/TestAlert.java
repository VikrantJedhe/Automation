package testPack1;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack1.PomAlert;
import test_package.Utility;

public class TestAlert {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException
	{
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		driver= new ChromeDriver(Options);
		
		driver.manage().window().maximize();		
	}
	
	@Test
	public void OpenWebPage() throws InterruptedException
	{
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(5000);	
		
		PomAlert obj= new PomAlert(driver);
		
		obj.ClickTryItButton();
		
		Thread.sleep(2000);
		
		ArrayList <String> arr= new ArrayList<> (driver.getWindowHandles());
		driver.switchTo().window(arr.get(1));
		System.out.println("Focus of selenium has switched to child browser");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		System.out.println("Focus of selenium has switched to iframe");
		
		obj.ClickTryIt();
		
		System.out.println("Alert Popup is Opened");
		
		Alert a = driver.switchTo().alert();
		
		String text= a.getText();
		
		System.out.println("Text on alert Popup is "+text);
		
		a.accept();
		
		System.out.println("Test Passed");	
		
	}
		
	
	@AfterMethod
	public void Teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		if (driver!=null)
		{
			driver.quit();
		}
	}
	
	
}
