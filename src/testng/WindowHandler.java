package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandler {

	ChromeDriver dr;
	String url="https://demo.guru99.com/popup.php";
	
	@BeforeTest
	public void set()
	{
		dr=new ChromeDriver();
		
	}
	
	@Test
	public void windowhandler()
	{
		dr.get(url);
		
		String frstwindow=dr.getWindowHandle();
		
		dr.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> scndwindow=dr.getWindowHandles(); 
		
		for(String str:scndwindow)
		{
			if(!str.equalsIgnoreCase(frstwindow))
			{
				dr.switchTo().window(str);
				
				dr.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
				dr.findElement(By.name("btnLogin")).click();
				
				dr.close();
				
			
			}
		}
		
		dr.switchTo().window(frstwindow);
		
		String title=dr.findElement(By.xpath("/html/body/div[2]/h2")).getText();
		System.out.println("Title of the page is :"+title);
		
		dr.quit();
		
		
	}
}
