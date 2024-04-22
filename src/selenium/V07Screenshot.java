package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class V07Screenshot {
	
	public void captureSS(WebDriver driver,String Name)throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("\\F:\\New sc\\"+Name+".jpg");                         
		FileHandler.copy(source, dest);
		
		
//		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File dest=new File("\\F:\\New sc\\facebook1.jpg");
//		
//		FileHandler.copy(source, dest);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		V07Screenshot sc =new V07Screenshot();
		sc.captureSS(driver,"facebook 2");
		
		Thread.sleep(3000);
		
		WebElement createAc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		createAc.click();
		Thread.sleep(2000);
		
		sc.captureSS(driver,"create ac");
		
		
		//driver.close();

	}

}
