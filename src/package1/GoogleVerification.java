package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleVerification {
	
	ChromeDriver dr;
	
	String url="https://www.google.com";
	
	@Before
	public void setUp()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test1()
	{
		dr.get(url);
		
		//dr.findElement(By.name("q")).sendKeys("animals",Keys.ENTER);
		//dr.findElement(By.name("btnK")).click();
		
		WebElement search=dr.findElement(By.name("q"));
		search.sendKeys("animal world",Keys.ENTER);
		
		//search.submit();
	}

}
