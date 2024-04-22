package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class V01Sc {

	
	public void capture(WebDriver driver, String name) throws IOException {
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("F:\\New sc\\"+name+".jpg");
		FileHandler.copy(source, dest);
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		//Screenshot demo
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		V01Sc SS = new V01Sc();
		SS.capture(driver, "FbLogin");
		
		driver.quit();
	
		
	}

}
