package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pomConcept.V01Pom;

public class V01TestNG {
	@Test
	public void checkTC1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		V01Pom obj = new V01Pom(driver);
		
		obj.sendUsername();	
		Thread.sleep(3000);
		obj.sendPass();
		Thread.sleep(3000);
		obj.LoginBtnClick();
		Thread.sleep(3000);
		
		//driver.close();
		
		
	}
}