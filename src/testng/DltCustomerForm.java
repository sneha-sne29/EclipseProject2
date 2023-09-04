package testng;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DltCustomerForm {
	
	ChromeDriver dr;
	String u="https://demo.guru99.com/test/delete_customer.php";
	
	@BeforeTest
	public void start()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test() 
	{
		
		dr.get(u);
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		dr.findElement(By.name("cusid")).sendKeys("CUS_002");
		
		dr.findElement(By.name("submit")).click();
		
		
		dr.switchTo().alert().accept();
		
		Alert alert=dr.switchTo().alert();
		String al=alert.getText();
		System.out.println("The alert appeared after deletion of customer is ---"+al);
		alert.accept();
			
	}
	
	@AfterTest
	public void stop() 
	{
		dr.quit();
	}

}
