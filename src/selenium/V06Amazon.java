package selenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V06Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//example of run type polymorphism(upcasting)

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

		WebElement searchmobile=driver.findElement(By.id("twotabsearchtextbox"));
		searchmobile.sendKeys("Smartphones");
		
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
				search.click();
		
		WebElement select=driver.findElement(By.className("s-image"));
		select.click();
		
		Thread.sleep(3000);
		
		ArrayList <String> add= new ArrayList<>(driver.getWindowHandles());
		System.out.println(add);
		driver.switchTo().window(add.get(1));
		
//	  JavascriptExecutor js= (JavascriptExecutor)driver;
//	   js.executeScript("windows.scrollBy(222,600)");
//	   Thread.sleep(3000);
		
	   
		WebElement addcart=driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		addcart.click();
		
		//driver.switchTo().window(add.get(2));
		driver.switchTo().frame("iframeResult");
		WebElement proceed=driver.findElement(By.xpath("//input[@type='submit'][45]"));
		proceed.click();
		
		Alert a= driver.switchTo().alert();
		
		String x= a.getText();
		System.out.println(x);
		Thread.sleep(3000);
		a.accept();
		
		driver.close();




	}

}
