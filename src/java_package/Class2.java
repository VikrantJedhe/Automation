package java_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "F:\\Selenium\\New folder\\msedgedriver.exe");
		
		EdgeOptions EOptions = new EdgeOptions();
		EOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new EdgeDriver(EOptions);
		
//		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\All Drivers\\chromedriver.exe");
//		
//		ChromeOptions Options = new ChromeOptions();
//		Options.addArguments("--remote-allow-origins=*");
//		
//		WebDriver driver= new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com//js//tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
	}
}
