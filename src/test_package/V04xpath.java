package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class V04xpath {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	// WebElements have found using xpath by Attribute
		
		WebElement UserName= driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement Login= driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		
		Thread.sleep(5000);
		
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String ActualUrl= driver.getCurrentUrl();
		
		if(ExpectedUrl.equals(ActualUrl)) // To validate that Actual Url matches with Expected URL
		{
			System.out.println("Home Page is displayed");
		}
		else 
		{
			System.out.println("Test has Failed");
			
			System.out.println("Title on page is "+ driver.getTitle());
			
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	

}
