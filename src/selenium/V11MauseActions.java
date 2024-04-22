package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class V11MauseActions {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.amazon.in//");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("searchDropdownBox")).click();
			Thread.sleep(2000);
			
			Actions a=new Actions(driver);
			for(int i=4;i>=0;i--)
			{
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(3000);
			}
			a.click().build().perform();
			
	}

}
