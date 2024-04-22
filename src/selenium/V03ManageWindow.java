package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V03ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
	 //	Class.Method()
		driver.get("https://www.facebook.com//");
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen(); //Full screen
		Thread.sleep(2000);
		
		Dimension d = new Dimension(400,400);
	  //Class obj   = new Constructor(width, height)
		driver.manage().window().setSize(d);// Set size of the window
		Thread.sleep(2000);
		
		Point p = new Point(400,400);
	 //Class obj = new Constructor(x,y)
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
		
		
		

	}

}
