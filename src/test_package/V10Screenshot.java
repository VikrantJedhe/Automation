package test_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class V10Screenshot {

	
	public void screenshot(WebDriver driver, String Name) throws IOException
	{
		//File Source ,File Desination, FileHandler.copy(Source, Destination)
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Selenium Screenshots\\"+Name+".jpg");
		FileHandler.copy(source,dest);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(Options);
		driver.manage().window().maximize();
		
		// OpenWebpage
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		// Create Object of Class
		V10Screenshot obj= new V10Screenshot();
		
		//Call screenshot Method
		obj.screenshot(driver,"fbtest1");
		obj.screenshot(driver,"fbtest2");
		
		
		
		Thread.sleep(3000);
		if(driver!=null)
		{
			driver.quit();
		}
		
	}
}
