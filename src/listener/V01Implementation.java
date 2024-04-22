package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class V01Implementation implements ITestListener {
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("On test failure.... "+Result.getName());
	}
}

	
	
