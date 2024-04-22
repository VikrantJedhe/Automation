package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class V05xpath {
	

	public WebDriver driver;
	
	
	@BeforeMethod 
	public void setup() throws InterruptedException
	{
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		driver= new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test (priority=1)
	public void openWebpage() throws InterruptedException
	{
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void logIn() throws InterruptedException
	{
		openWebpage(); // Open WebPage before locating elements
		
		Thread.sleep(3000);
		
		WebElement UserName= driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement Login= driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		
		Thread.sleep(5000);
		
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String ActualUrl= driver.getCurrentUrl();
		
		if(ExpectedUrl.equals(ActualUrl)) // To validate that Actual Url matches with Expected URL
		{
			System.out.println("Home Page is displayed");
		}
		else 
		{
			System.out.println("Test has Failed");
			
			System.out.println("Title on page is "+ driver.getTitle());
			
		}
		
	}
	
	@Test(priority=3)
	public void forgetPassword() throws InterruptedException
	{
		openWebpage(); //Navigate to page before finding WebElements
		Thread.sleep(2000);
		
		WebElement ForgetPass= driver.findElement(By.xpath("//p[text()='Forgot your password? ']")); //xpath by Text
		Thread.sleep(2000);
		ForgetPass.click();
		Thread.sleep(1000);
	
	}
	
	@AfterMethod private void TearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		if (driver!=null)
		{
			driver.quit();
		}

	}

}

