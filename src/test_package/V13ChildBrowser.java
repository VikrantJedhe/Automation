package test_package;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class V13ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		WebElement Try= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		Try.click();
		Thread.sleep(3000);
		
		ArrayList <String> arr= new ArrayList <>(driver.getWindowHandles());  // Store address of child windows
		
		System.out.println(arr);
		
		driver.switchTo().window(arr.get(1)); // Switch focus to child browser
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult"); // Switch focus to iframe
	
		
		WebElement TryIt= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		TryIt.click();
		
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();  //Switch focus to alert
		String text=a.getText();
		
		System.out.println("Text on popup is "+text);
		
		Thread.sleep(3000);
	
		a.accept();
		
		
		
		if(driver!=null)
		{
			driver.quit();
		}
		
		
		
	}

}


		