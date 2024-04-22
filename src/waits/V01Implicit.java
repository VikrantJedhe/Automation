package waits;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class V01Implicit {
	WebDriver driver;
	@BeforeTest
	
	public void Test1() 
	{

	System.setProperty("webdriver.edge.driver", "F:\\Selenium\\Soft Stuff\\msedgedriver.exe");
	driver=new EdgeDriver();
	
	
	driver.navigate().to("https://www.facebook.com//");
	
//	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MICROSECONDS);
	

	}
	
	@Test
	public void Test() 
	{
		driver.quit();
	}
	
}

