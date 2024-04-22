package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V07DropdownList {

	
	WebDriver driver;
	
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
	
	@Test(priority=1)
	public void openWebpage() throws InterruptedException
	{
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void signupPage() throws InterruptedException
	{
		openWebpage(); // To open webpage before finding WebElement
		Thread.sleep(2000);
		
		WebElement CreateNewAccountBtn =driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		Thread.sleep(2000);
		
		CreateNewAccountBtn.click();
		Thread.sleep(3000);	
		
	WebElement Day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	WebElement Month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	WebElement Year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Select d= new Select(Day); // Create Object Of Select Class
	
	Thread.sleep(2000);
	d.selectByIndex(26); // selectByIndex()
	
	Thread.sleep(2000);
	
	Select m= new Select(Month);
	
	Thread.sleep(2000);
	m.selectByVisibleText("May"); // selectByVisibleText("")
	
	Select y= new Select(Year);
	
	Thread.sleep(2000);
	y.selectByValue("1997"); // selectByValue("")
	
	Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void TearUp() throws InterruptedException
	{
		
		if (driver!=null)
		{
			driver.quit();
		}
	}
	

}
