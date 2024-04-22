package selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class V09Popup {
	
	public void capture (WebDriver driver, String Name ) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest= new File("F:\\New sc"+Name+".jpg");
		FileHandler.copy(source, dest);
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		//Take Screenshot
		
		V09Popup sc= new V09Popup();
		
		sc.capture(driver, "W3 login");
		
		System.out.println("Screenshot Captured");
		
		WebElement tryit =driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		tryit.click();
		
		ArrayList <String> arr= new ArrayList<>(driver.getWindowHandles());
		
		System.out.println(arr);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(arr.get(1));// To handle child browser popup
		
		System.out.println("Focus switched to new window");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		System.out.println("Focus switched to iframe ");
		
		WebElement tryitbtn= driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryitbtn.click();
		Thread.sleep(3000);
		
		Alert a= driver.switchTo().alert();
		
		System.out.println("Focus switched to alert popup");
		
		a.accept();// click on positive event
		//a.dismiss();//click on negative event
		
		String x= a.getText(); //get text on alert popup
		
		System.out.println(x); 
		
		System.out.println("Alert popup handled successfully");
		
		
	}

}
