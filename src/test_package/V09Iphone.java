package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V09Iphone {
	
	
	@Test
	public void setup()
	{
		ChromeOptions Options =new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(Options);
		
		driver. manage().window().maximize();
		
		// Step1: Navigate to Google.in
		
		driver.navigate().to("https://www.google.co.in/");
		
		// Step 2: Locate searchbox -> Search Iphone 
		
		WebElement searchBox= driver.findElement(By.xpath("//textarea[@title='Search']"));
		
		searchBox.sendKeys("Iphone");
		
//		searchBox.sendKeys(Keys.ENTER);
		searchBox.submit();
		
		//Step3: search for amazon link
		
		WebElement amazonLink= driver.findElement(By.xpath("(//cite[contains(text(),'amazon')])[1]"));
		
		amazonLink.click();
		
		//Step4: Click on 1st iphone
	
		WebElement anyIphone= driver.findElement(By.xpath("(//a[contains(@href,'iphone')]) [13]"));
		
		anyIphone.click();
		
		
	}
	

}
