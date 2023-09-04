package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
	
ChromeDriver driver;
	
	String url="https://www.rediff.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void verify()
	{
		driver.get(url);
				
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
		
		//identify img
		
		WebElement e=driver.findElement(By.xpath("//div[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		
		//checking img is displayed 
		Boolean b=e.isDisplayed();
		
		if(b)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		
		

		
		

	}
	

}
