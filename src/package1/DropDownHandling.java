package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	
ChromeDriver driver;
	
	String url="https://www.rediff.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get(url);
		
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
		
		WebElement e=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select day=new Select(e);
		day.selectByValue("29");
		
		WebElement a=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select month=new Select(a);
		month.selectByVisibleText("OCT");
		
		WebElement b=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select year=new Select(b);
		year.selectByVisibleText("2000");
		
		
	}
	

}
