package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerMarinersForex {
	
	ChromeDriver driver;
	String url="https://www.marinersforex.com/Flights-Booking";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1()
	{
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/input")).click();
		
		WebElement yearele=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div"));
		String year=yearele.getText();
		if(year.equals("2026"))
		{
			System.out.println("year="+year);
		}
		else
		{
			yearele.click();
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[127]/button")).click();
		}
		
        
		
		while(true)
		{
			String month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div")).getText();
			
			if(month.equalsIgnoreCase("October"))
			{
				System.out.println("month ="+month);
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]")).click();
			}
			
		}
		
		List<WebElement> li=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/button"));
		for(WebElement dates:li)
		{
			String date=dates.getText();
			if(date.equals("29"))
			{
				dates.click();
				break;
			}
		}
	}
	

}
