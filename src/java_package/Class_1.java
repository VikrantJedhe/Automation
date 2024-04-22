package java_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import test_package.Utility;

public class Class_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		EdgeOptions EOptions = new EdgeOptions();
//		EOptions.addArguments("--remote-allow-origins=*");
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver(EOptions);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		 
		
	}

}
