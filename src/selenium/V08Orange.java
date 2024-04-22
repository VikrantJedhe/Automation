package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class V08Orange {
	
	public void capture(WebDriver driver, String Name) throws IOException
	{
	
	
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File ("\\F:\\New sc\\"+Name+".jpg");
		
		FileHandler.copy(source,dest);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		System.out.println("Link Opened");
		WebElement Username = driver.findElement(By.xpath("//input [@ name=\'username\']"));
		Username.sendKeys("Admin");
		
		WebElement Pass= driver.findElement(By.xpath("//input[@name=\'password\']"));
		Pass.sendKeys("admin123");
		Thread.sleep(3000);
		
		WebElement login= driver.findElement(By.xpath("//button[@type=\'submit\']"));
		login.click();
		Thread.sleep(3000);
		V08Orange screen= new V08Orange();
		
		//screen.capture(driver, "Orange Login");
		System.out.println("Login Successfully");
		WebElement hint = driver.findElement(By.xpath("//input[@placeholder=\'Type for hints...\']"));
		hint.sendKeys("vikrant");
		
		WebElement empId = driver.findElement(By.xpath("(//input[@class=\'oxd-input oxd-input--active\'])[2]"));
		empId.sendKeys("1234vh");
		Thread.sleep(3000);
	//System.out.println("Manage Dropdown");
	//Step 1: Find Element
		//WebElement empStatus= driver.findElement(By.xpath("(//i [@class=\'oxd-icon bi-caret-down-fill oxd-select-text--arrow\'])[1]"));
		// empStatus.click();
		//WebElement empStatus= driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")); 
	//Step 2:Create object of Select Class with argument
		//Select es = new Select(empStatus);
	//Step 3: Call Method
//		empStatus.click();
//		Thread.sleep(3000);
		
//		WebElement Freelance= driver.findElement(By.xpath("//div[text()='Freelance']"));
//		Freelance.click();
		
		
//		Actions a =new Actions(driver);
//		a.moveToElement(Freelance).build().perform();
//		
		//empStatus.sendKeys("Freelance");
		
		Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.xpath("//button [@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		add.click();
		
		WebElement fName= driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		fName.sendKeys("The");
		
		WebElement mName= driver.findElement(By.xpath("//input[@name='middleName']"));
		mName.sendKeys("Ultimate");
		
		WebElement lName= driver.findElement(By.xpath("//input[@name='lastName']"));
		lName.sendKeys("Thor");
		
		WebElement empId1 =driver.findElement(By.xpath("(//input [@class='oxd-input oxd-input--active'])[2]"));
		empId1.sendKeys("0026");

		System.out.println("New Employee details filled");
		
		Thread.sleep(3000);
		
		WebElement createBtn= driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		createBtn.click();
		
		WebElement uName =driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		
		uName.sendKeys("Thunder1");
		

		WebElement newPass =driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		
		newPass.sendKeys("Godofthunder@26");
		
		Thread.sleep(3000);
		

		WebElement confirm =driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
	
		confirm.sendKeys("Godofthunder@26");
		
		Thread.sleep(2000);
		
		WebElement disable = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		
		disable.click();
		
		Thread.sleep(3000);
		
		WebElement enable = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
		
		enable.click();
		
		System.out.println("Login details filled successfully");
		
		Thread.sleep(3000);
		
		//screen.capture(driver, "new login");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
	driver.close();
	}

}
