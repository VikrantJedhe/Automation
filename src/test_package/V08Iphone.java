package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class V08Iphone {
	
	public static void main(String[] args) {
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");   
        
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // 1. Navigate to google.com
        driver.get("https://www.google.com");

        // 2. Search for "Iphone"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Iphone");
        searchBox.submit();

        // 3. Find and click on Amazon.in link
        WebElement amazonLink = driver.findElement(By.xpath("//cite[contains(text(),'www.amazon.in')]"));
        amazonLink.click();

        // 4. Click on 1st  iphone // not working
        
        WebElement firstIPhoneLink = driver.findElement(By.xpath("//a[contains(@href, 'Iphone')][1]"));
        firstIPhoneLink.click();
        
        // Close the browser
//        driver.quit();
	}

}
