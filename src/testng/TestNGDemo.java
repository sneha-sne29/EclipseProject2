package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("open browser");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url loading");
	}
	
	@Test(priority=0,groups= {"smoke"})//enabled=false//invocationCount = 3
	public void titleverification()
	{
		System.out.println("title verification");
	}
	
	@Test(priority=2,groups= {"smoke"})//enabled=false
	public void pagesrcverification()
	{
		System.out.println("page source verification");
	}
	
	@Test(priority=1,groups= {"sanity"})//dependsOnMethods = "titleverification")
	public void logodisplay()
	{
		System.out.println("logo display");
	}
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"smoke","regression"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("browser close");
	}

}
