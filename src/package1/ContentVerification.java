package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVerification {
	
	ChromeDriver driver;
	
	String url="https://www.flipkart.com";
	
	@Before
	public  void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void PageVerification()
	{
		driver.get(url);
		
		String sc=driver.getPageSource();
		
		if(sc.contains("Grocery"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}
	
	@After
	public void stop()
	{
		driver.quit();
	}
	
	

}
