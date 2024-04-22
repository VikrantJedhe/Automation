package alertPopup;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class V04Alert {
	
	public void Scroll(WebDriver driver,WebElement ScrollUpto)
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true);",ScrollUpto);
		System.out.println("Scrolldown handled successfully");
	}
	@Test
	public void alert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		WebElement TryIt= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		Thread.sleep(3000);
		
//		V04Alert obj= new V04Alert();
//		obj.Scroll(driver, TryIt);
		
		TryIt.click();
		Thread.sleep(3000);
		ArrayList <String> add= new ArrayList <> (driver.getWindowHandles());
	
		driver.switchTo().window(add.get(1));
		
		
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		
		WebElement TryItBtn= driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(3000);
		TryItBtn.click();
		Thread.sleep(3000);
		
		Alert a= driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		a.accept();
		System.out.println("Alert popup handled successfully");
		
		
		
		
		
		
		
		
		
		
	}

}
