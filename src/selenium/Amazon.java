package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement search= driver.findElement(By.xpath("//input [@title='Search']"));
		
		search.sendKeys("Shoes");
		Thread.sleep(3000);
		WebElement searchbtn= driver.findElement(By.xpath("//input[@value='Google Search']"));
		searchbtn.click();
		System.out.println("C");
		Thread.sleep(3000);
		WebElement amzn= driver.findElement(By.xpath("//*[contains(text(),'Amazon')]"));
		
		amzn.click();
	}

}
