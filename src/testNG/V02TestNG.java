package testNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomConcept.V01Pom;

public class V02TestNG {
	
	@BeforeClass
		public void BC()
		{
		System.out.println("Before Class");
		}
	
	@BeforeMethod
		public void BM()
		{
		System.out.println("Before Method");
		}
	
	@Test
	
		public void test1() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		V01Pom obj = new V01Pom(driver);
		Thread.sleep(3000);
		obj.sendUsername();
		Thread.sleep(3000);

		obj.sendPass();
		Thread.sleep(3000);

		obj.LoginBtnClick();
		}
	
	@AfterMethod
		public void AM()
		{
			System.out.println("After Method");
		}
	@AfterClass
		public void AC()
		{
		System.out.println("After Class");
		}
		
	

}
