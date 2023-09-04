package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
ChromeDriver ob;
	
	String url="https://facebook.com";
	
	@Before
	public void start()
	{
		ob=new ChromeDriver();
	}
	
	@Test
	public void testing()
	{
		ob.get(url);
		
		
		ob.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		
		ob.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc12");
		
		ob.findElement(By.xpath("//button[@name='login']")).click();
		
		
				
		
		
	}

}
