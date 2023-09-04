package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {
	
	ChromeDriver driver;
	
	String url="https://flipkart.com";
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("smartwatches",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='_2Sn47c']/div/div/button")).click();
		
		driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	}

}
