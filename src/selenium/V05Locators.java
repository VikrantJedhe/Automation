package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class V05Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		Thread.sleep(2000);
		
		WebElement userName= driver.findElement(By.name("email"));
		
		userName.sendKeys("Vikrant");
		
		WebElement password= driver.findElement(By.id("pass"));
		
		password.sendKeys("12345");
		
		WebElement logIn= driver.findElement(By.name("login"));
		
		logIn.click();
		
		System.out.println("Login Done");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		WebElement createAc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		createAc.click();
		
		System.out.println("Create an account");
		Thread.sleep(4000);
		WebElement fName= driver.findElement(By.xpath("//input[@name='firstname']"));
										//(By.xpath("//tagName[@attribute='value']"))
		fName.sendKeys("Vikrant");
		Thread.sleep(3000);
			
		WebElement sirName= driver.findElement(By.xpath("//input[@name='lastname']"));
										//(By.xpath("//tagName[@attribute='value']"))
		sirName.sendKeys("Jedhe");
		
		//DropDown or SelectBox or DropBox
		WebElement day= driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select d= new Select(day); // Create object of select class
		d.selectByIndex(25);// ByVisibleText Method to select value from drop-down
		
		System.out.println("Day is selected");
		Thread.sleep(2000);
		
		WebElement month= driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select e= new Select(month);
		e.selectByValue("5"); //SelectByValue Method
		
		System.out.println("Month is selected");
		Thread.sleep(2000);
		
		WebElement year= driver.findElement(By.xpath("//Select[@name='birthday_year']"));
		
		Select f= new Select(year);
		
		System.out.println("Year is selected");
		Thread.sleep(2000);
		
		f.selectByVisibleText("1997");//SelectByVisibleText Method
		Thread.sleep(2000);
		WebElement radiobt =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radiobt.click();
	}

}
