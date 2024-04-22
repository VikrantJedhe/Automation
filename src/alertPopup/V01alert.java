package alertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V01alert {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com//js//tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		//Focus switched to iframe
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(3000);
		WebElement TryIt= driver.findElement(By.xpath("//button [text()='Try it']"));
		TryIt.click();
		Thread.sleep(3000);
		//Handle alert popup
		Alert a= driver.switchTo().alert();
		 
		String x= a.getText(); //get text on alert popup
		
		System.out.println(x);
		
		System.out.println("check");
		Thread.sleep(3000);
		a.accept();

		System.out.println("Alert popup handled successfully");
		
		
		
	}
}
