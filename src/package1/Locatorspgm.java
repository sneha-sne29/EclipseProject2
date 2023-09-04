package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspgm {
	
	ChromeDriver ob;
	
	String url="https://facebook.com";
	
	@Before
	public void start()
	{
		ob=new ChromeDriver();
	}
	
	@Test
	public void Testing()
	{
		ob.get(url);
		
		//ob.findElement(By.name("email"));
		ob.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		ob.findElement(By.id("pass")).sendKeys("abc12");
		
		ob.findElement(By.name("login")).click();
		
				
		
		
	}

}
