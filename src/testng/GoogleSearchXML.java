package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchXML {
	
	ChromeDriver driver;
	
	String url="https://www.google.com";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void start()
	{
		driver.get(url);
	}
	
	@Parameters({"search"})
	
	@Test
	public void test(String search)
	{
		driver.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
	}
	
	@AfterTest
	public void stop()
	{
		driver.quit();
	}
	

}
