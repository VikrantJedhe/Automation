package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGPTCode {

	
	 public WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void openWebpage() throws InterruptedException {
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        Thread.sleep(5000);
	    }

	    @Test
	    public void forgetPassword() throws InterruptedException {
	        openWebpage(); // Navigate to the page before attempting to find elements
	        Thread.sleep(2000);
	        WebElement forgetPass = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
	        Thread.sleep(2000);
	        forgetPass.click();
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	

}
