package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V02OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	System.out.println("Chrome browser started successfully");
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	String title=driver.getTitle(); //driver.getTitle() // To get title of webpage
	System.out.println("The title of webpage is "+title);
	
	String URL=driver.getCurrentUrl(); //driver.getCurrentUrl() //To get url of webpage
	System.out.println("The url of the webpage is "+URL);
	
	//driver.close();		//To close current tab
	
	driver.quit();			//To close all tabs of browser
	
	
	
	
	
		
		
		

	}

}
