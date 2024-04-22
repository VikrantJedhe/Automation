package table;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V01Handle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		//To fetch specific data from table
		WebElement Contact=driver.findElement(By.xpath("(//table)[1]//tr[5]//td[2]"));
		Thread.sleep(3000);
		String data=Contact.getText();
		System.out.println(data);
		System.out.println("cp01");

		//To fetch all data from table
		WebElement Alldata=driver.findElement(By.xpath("(//table)[1]"));
		Thread.sleep(3000);
		String tabledata=Alldata.getText();
		System.out.println(tabledata);
		System.out.println("cp02");
		
//		WebElement table =driver.findElement(By.xpath("(//table)[1]"));
//		List <WebElement> rows= table.findElements(By.xpath("//tr"));
		Thread.sleep(3000);

		System.out.println("Check 2");

		// To get  count of rows from table 1 and all tables
		List <WebElement> rows= driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println("cp1");
		int r= rows.size();
		Thread.sleep(3000);
		System.out.println(r);
		Thread.sleep(3000);
		List <WebElement> allrows= driver.findElements(By.xpath("//tr"));
		int allr= allrows.size();
		System.out.println(allr);
		System.out.println("cp2");
		
		// To get  count of columns from table 1 and all tables
		List <WebElement> col= driver.findElements(By.xpath("(//table)[1]//td"));
		System.out.println("cp3");
		int c= col.size();
		Thread.sleep(3000);
		System.out.println(c);
		Thread.sleep(3000);
		List <WebElement> allcol= driver.findElements(By.xpath("//td"));
		int allc= allcol.size();
		System.out.println(allc);
		System.out.println("cp4");
		
		driver.quit();
	
	}

}
