package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
	
	ChromeDriver driver;
	
	String url="https://www.rediff.com";
	
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
		
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
	}
	
	@Test(priority=0)
	public void textverify()
	{
		WebElement ele=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		String s=ele.getAttribute("value");
		
		String s1="Check availability";
		
		System.out.println("---Text Verification---");
		
		if(s1.equals(s))
		{
			System.out.println("The text retrieved is "+ s +" and it is same as expected");
		}
		else
		{
			System.out.println("The text retrieved is "+ s +" and it is different from expected");
		}
		
	}
	
	@Test(priority=1)
	public void select()
	{
		WebElement e=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]"));
		
		Boolean b=e.isSelected();
		
		System.out.println("----Validating Radio Button-----");
		
		if(b)
		{
			System.out.println("Radio button is selected and the selected gender is "+e.getAttribute("value"));
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
	}
	
	@AfterTest
	public void stop()
	{
		driver.quit();
	}

}
