package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollDemo {

	public void capture(WebDriver driver, String Name) throws IOException
	{
		File source=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("\\F:\\New sc\\ "+Name+".jpg");
		FileHandler.copy(source, dest);
	
	} 
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com//js//js_popup.asp");
	Thread.sleep(3000);
		ScrollDemo sc= new ScrollDemo();
		sc.capture(driver, "w3");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(000,1500)");
	Thread.sleep(5000);
		j.executeScript("window.scrollBy(000,-500)");
		
	Thread.sleep(3000);
	
	WebElement tryit= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	tryit.click();
	System.out.println("CP1");
	Thread.sleep(5000);
	j.executeScript("arguments[0].scrollIntoView(true);",tryit);
	
	Thread.sleep(3000);
	
		

	}

}
