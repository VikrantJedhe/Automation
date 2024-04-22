package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class V03Locators {
	
	public static void main (String[] args) throws InterruptedException
	{
		// Script using Id /Name Locators
		
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(Options);
		
		driver. manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement emailId= driver.findElement(By.id("email"));
		emailId.sendKeys("test1@gmail.com");
		Thread.sleep(2000);
		
		WebElement passWord= driver.findElement(By.name("pass"));
		passWord.sendKeys("test@1234");
		Thread.sleep(2000);
		
		WebElement login= driver.findElement(By.name("login"));
		
		login.click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
