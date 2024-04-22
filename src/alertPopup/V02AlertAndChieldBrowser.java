package alertPopup;


import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class V02AlertAndChieldBrowser {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
	
		WebElement tryit =driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		tryit.click();
		
		// To handle child browser popup
		ArrayList <String> arr= new ArrayList<>(driver.getWindowHandles());
		
		System.out.println(arr);	
		driver.switchTo().window(arr.get(1));
		
		System.out.println("Focus switched to new window");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		System.out.println("Focus switched to iframe ");
		
		WebElement tryitbtn= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryitbtn.click();
		Thread.sleep(4000);
		Alert b= driver.switchTo().alert();
		 String x=b.getText();
		 Thread.sleep(3000);
		System.out.println("check");
		Thread.sleep(3000);
		b.accept();
		System.out.println("Alert popup handled successfully");
}}

