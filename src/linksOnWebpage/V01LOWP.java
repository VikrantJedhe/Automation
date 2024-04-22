package linksOnWebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V01LOWP {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		
		int x= links.size();
		System.out.println("No of links are "+x );
		
		for (int i=0; i<x;i++)
		{
			String L= links.get(i).getText();
			
			System.out.println(L);
		}
	}
}
