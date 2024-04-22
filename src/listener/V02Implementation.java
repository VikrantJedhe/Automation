package listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class V02Implementation extends V02TestOrange implements ITestListener {

	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("On test failure.... "+Result.getName());

	File source=((TakesScreenshot)super.driver).getScreenshotAs(OutputType.FILE);
	File dest= new File ("\\F:\\New sc\\failed.jpg");
				try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		
		}
	}
}
