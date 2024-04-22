package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V04Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
		WebElement userName = driver.findElement(By.id("email"));//id() locator
		
		userName.sendKeys("Vikrant");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.name("pass"));//name() locator
		password.sendKeys("123456");
		Thread.sleep(3000);
		
		//WebElement Login= driver.findElement(By.tagName("button")); //tagName() locator
				
		WebElement Login= driver.findElement(By.name("login"));
		Login.click();
		
		
		
		

	}

}
