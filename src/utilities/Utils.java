package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	//To Launch Chrome Browser
			public static WebDriver LaunchChrome() throws InterruptedException
			{
				ChromeOptions Options = new ChromeOptions();
				Options.addArguments("--remote-allow-origins=*");
				
				System.setProperty("webdriver.chrome.driver","F:\\Selenium\\All Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(Options); // To Open Browser
				
				Thread.sleep(2000);
				driver.manage().window().maximize();
				return driver;
			
			}
			
		//To Launch Edge Browser
					public static WebDriver LaunchEdge() throws InterruptedException
					{
						EdgeOptions Options= new EdgeOptions();
						Options.addArguments("--remote-allow-origins=*");
					
						System.setProperty("webdriver.edge.driver","F:\\Selenium\\All Drivers\\msedgedriver.exe");
						WebDriver driver = new EdgeDriver(Options);
						
						Thread.sleep(3000);
						driver.manage().window().maximize();
						
						return driver;
						
					}
			
		//To Launch Chrome Browser using WebdriverManager
			
			public static WebDriver LaunchWebBrowser( String BrowserName)
			{
				
				if (BrowserName== "Chrome")
				{
					ChromeOptions Options = new ChromeOptions();
					Options.addArguments("--remote-allow-origins=*");
					
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver(Options);
					
//					return driver;
				}
				
				else if (BrowserName== "Edge") 
				{
					EdgeOptions Options= new EdgeOptions();
					Options.addArguments("--allow-remote-origin=*");
					
					WebDriverManager.edgedriver().setup();
					EdgeDriver driver = new EdgeDriver(Options);
					
//					return driver;
				}
				return driver;
				
				
				
				
			}
			
			
		//To Launch Edge Browser using WebdriverManager
			
			public static WebDriver LaunchEdgeWeb()
			{
				
				EdgeOptions Options= new EdgeOptions();
				Options.addArguments("--allow-remote-origin=*");
				
				WebDriverManager.edgedriver().setup();
				EdgeDriver driver = new EdgeDriver(Options);
				
				return driver;
			}
			
			
		//Main Method	
			public static void main(String[] args) throws InterruptedException
			
			{
		// Call the method to launch the Chrome browser
				
				WebDriver driver= LaunchChrome();
				
				driver.get("https://www.google.com/");
			}
	
	
}
