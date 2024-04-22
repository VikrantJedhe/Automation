package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class V03testAnnotationsDemo {

	//Annotations and Keywords
		@Test(priority = -2,invocationCount = 2)
		public void test1() 
		{
			System.out.println("Test Method 1");
		}
		
		@Test (priority = 0,timeOut = 2000,dependsOnMethods ="test1")
		public void demo() throws InterruptedException
		{
		
			System.out.println("Test method 2");
		}
	
		@Test (enabled = false)
		public void dummy()
		{
			System.out.println(" not run ");
		}
		@BeforeClass
		public void test2()
		{
			System.out.println("Before class");
		}
		
		@AfterClass
		public void test3()
		{
			System.out.println("After class");
		}
		
		@BeforeMethod 
		public void test4()
		{
			System.out.println("Before Method");
		}
		
		@AfterMethod
		public void test5()
		{
			System.out.println("After Method");
		}
}
