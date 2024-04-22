package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class V01Fb {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com//");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Thread.sleep(3000);
		CreateNewAccount.click();
		Thread.sleep(5000);
		
		WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d= new Select(day);
		d.selectByIndex(25);
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select [@id='month']"));
		Select m= new Select(month);
		m.selectByVisibleText("May");
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select [@title='Year']"));
		Select y= new Select(year);
		y.selectByValue("1997");
		Thread.sleep(3000);
		
		
		
		

	}

}
