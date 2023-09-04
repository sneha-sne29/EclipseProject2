package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload1 {
	
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void fileup()
	{
		driver.get(url);
		
		driver.findElement(By.xpath("//div[@id='file_wraper0']/input")).sendKeys("C:\\Users\\HP\\Downloads\\desert.jpg");
		
		driver.findElement(By.id("submitbutton")).click();
		
	}

}
