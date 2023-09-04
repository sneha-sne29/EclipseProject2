package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerDemo1 {
	
	ChromeDriver driver;
	String url="https://demo.automationtesting.in/Datepicker.html";
	
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
		
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		
		WebElement yr=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]"));
		String year=yr.getText();
		if(year.equals("2026"))
		{
			System.out.println("year="+year);
			
		}
		else
		{
			yr.click();
			Select years=new Select(yr);
			years.selectByVisibleText("2026");
		}
		
		
		WebElement e=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]"));
		String txt=e.getText();
		if(txt.equalsIgnoreCase("October"))
		{
			System.out.println("month is "+txt);			
		}
		else
		{
			e.click();
			Select mnth=new Select(e);
			mnth.selectByVisibleText("October");
		}
		
		
	
		List<WebElement>li=driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td/a"));
		for(WebElement d:li)
		{
			String day=d.getText();
			if(day.equals("29"))
			{
				d.click();
				break;
			}
			
		}
		
	}	

}
