package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pomConcept.V02FlipkartPOM;
import test_package.Utility;
import utilities.Utils;

public class V10Flipkart {
	
	WebDriver dr;
	
	@Test
	public void flipkartdemo() throws InterruptedException
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\All Drivers\\chromedriver.exe");
	dr = new ChromeDriver(Options); // To Open Browser
	
	Thread.sleep(2000);
	dr.manage().window().maximize();
	
//		driver= Utility.LaunchChrome();
		
		
		
	Thread.sleep(3000);
	
	dr.manage().window().maximize();
	Thread.sleep(3000);
	
	dr.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	V02FlipkartPOM f= new V02FlipkartPOM(dr);
	Thread.sleep(3000);
	
	f.closeLogW();
	Thread.sleep(3000);
	
	f.ClickElectronics();
	Thread.sleep(3000);
	
	f.ClickAudio();
	Thread.sleep(3000);
	
	dr.close();
	
	
	
}
}