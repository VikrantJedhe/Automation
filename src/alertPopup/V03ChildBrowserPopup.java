package alertPopup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V03ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(3000);

	WebElement tryit =driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
	tryit.click();
	//Handle child browser popup
	String address= driver.getWindowHandle();// get address
	System.out.println(address);
	Thread.sleep(3000);
	// To handle child browser popup
	
	
	Set<String> x=driver.getWindowHandles();
	
	ArrayList <String> arr= new ArrayList<>(x);
	
	System.out.println(arr);	
	driver.switchTo().window(arr.get(1));
	
	//driver.switchTo().window(address);  //Focus switch to child browser popup window
	
	System.out.println("Focus switched to new window");
	Thread.sleep(3000);
	
	driver.switchTo().frame("iframeResult");
	
	System.out.println("Focus switched to iframe ");
	
	WebElement tryitbtn= driver.findElement(By.xpath("//button[text()='Try it']"));
	
	tryitbtn.click();
	
	
	
	}}
