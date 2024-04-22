package test_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class V12Alert {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		

		driver.switchTo().frame("iframeResult"); // Switch focus to iframe
	
		
		WebElement TryIt= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		TryIt.click();
		
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();  //Switch focus to alert
		String text=a.getText();
		
		System.out.println("Text on popup is "+text);
		
		Thread.sleep(3000);
	
		a.accept();
//		a.dismiss();
//		a.getText();
		
		if(driver!=null)
		{
			driver.quit();
		}
		
		
		
		
	}

}
