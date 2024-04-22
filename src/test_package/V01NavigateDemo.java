package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class V01NavigateDemo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(Options);
		
		driver. manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.navigate().back(); // Navigate Back
		Thread.sleep(3000);
		
		driver.navigate().forward(); // Navigate Forward
		Thread.sleep(3000);
		
		driver.navigate().refresh(); //Refresh the page
		Thread.sleep(3000);
		
		String title= driver.getTitle(); // To get Title of Page
		System.out.println("Title on page is "+title);
		Thread.sleep(3000);
		
		String url= driver.getCurrentUrl(); // To get URL of Page
		System.out.println("Url of page is "+url); 
		Thread.sleep(3000);
		
		
		
	    //driver.close();
		driver.quit();
		
		
		
		
		
	}

}
