package alertPopup;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V05Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
	
		
		WebElement TryItBtn= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		TryItBtn.click();
		
		ArrayList <String> add= new ArrayList<>(driver.getWindowHandles()); //Find & save the addresses
		
		driver.switchTo().window(add.get(1)); // move focus to child window
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		
		WebElement TryIt=driver.findElement(By.xpath("//button[text()='Try it']"));
		TryIt.click();
		Thread.sleep(3000);
		
		Alert a= driver.switchTo().alert();
		a.accept();
		
		System.out.println("handled successfully");
		driver.quit();
		
		
		
		
		

	}

}
