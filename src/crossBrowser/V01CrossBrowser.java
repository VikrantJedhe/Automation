package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class V01CrossBrowser {

	
WebDriver driver;
	

	@BeforeTest()
	@Parameters("Browser")
	
	public void OpenBrw(String BrowserName) throws InterruptedException
	{
        if(BrowserName.equalsIgnoreCase("Chrome"))
        {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		
        }
 
		if(BrowserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "F:\\Selenium\\Soft Stuff\\msedgedriver.exe");
		
				driver=new EdgeDriver();
				Thread.sleep(3000);
				driver.manage().window().maximize();
				Thread.sleep(3000);

				driver.navigate().to("https://www.snapdeal.com/");
				Thread.sleep(3000);
				
				driver.quit();
		}
        
	}
		@Test
		public void Test1()
		{
			System.out.println("Crossbrowser done successfully");
}
}
