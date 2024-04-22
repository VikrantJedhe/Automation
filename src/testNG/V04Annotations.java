package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class V04Annotations {
	
	@Test
	public void test1()
	{
		System.out.println("test method");
	}
	@BeforeClass
	public void before_class()
	{
		System.out.println("B class");
	}
	
	@BeforeMethod
	public void before_method()
	{
		System.out.println("B Method");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("A class");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("A Method");
	}
}
