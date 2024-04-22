package extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	 
	public static void main(String[] args) throws InterruptedException {
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("./test-output/Extent01.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		ExtentTest test= extent.createTest("Verify snapdeal homepage");
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO,"Starting the test");
		driver.get("https://www.snapdeal.com/");
		
		test.pass("link open successfully");
//		test.fail("link not open ");
		Thread.sleep(3000);
		
		test.pass("Test Completed");	
		driver.quit();
		
		test.pass("Browser Closed");
		System.out.println("Test completed");
		extent.flush();
		
		
		
		
		

	}

}
