package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V06xpath {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		driver = new ChromeDriver(Options);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void openWebpage() throws InterruptedException
	{
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void search() throws InterruptedException
	{
		openWebpage();
		
		Thread.sleep(3000);
		// Xpath by contains is not working
		
//		WebElement Searchbox =driver.findElement(By.xpath("//textarea[contains(@data-ved,'0ahUKEwjCxb2Jr7qFAxXSh1YBHWZ')]"));
        
		WebElement Searchbox =driver.findElement(By.xpath("//textarea[@title='Search']"));
		
		Searchbox.sendKeys("Nike Shoes buy online");
		
		Thread.sleep(2000);
		
//		Searchbox.sendKeys(Keys.ENTER);  //To click enter button from Keyboard
		
		// xpath by Index is not working
		
//		WebElement SearchButton =driver.findElement(By.xpath("(//input[@role='button']) [2]")); 
//		WebElement SearchButton =driver.findElement(By.xpath("(//input[@value='Google Search']) [2]"));
		
		WebElement SearchButton =driver.findElement(By.xpath("//input[@name=\"btnK\"]"));

		SearchButton.click();
		
		Thread.sleep(5000);

	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		if (driver!=null)
		{
			driver.quit();
		}
	}

}
