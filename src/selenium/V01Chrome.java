package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class V01Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "F:\\Selenium\\Soft Stuff\\msedgedriver.exe");
	  //ClassName.Methodname("Selenium Webdriver.Browser.Chrome Driver","Path where Chrome driver stored")
		
		
		WebDriver driver=new EdgeDriver();
	  //Interface object= new SubClass();
		
		//driver.get("https://www.facebook.com//");
		
		//driver.navigate().to("https://www.facebook.com//");
		driver.navigate().to("https://www.facebook.com//");
		

	}

}
