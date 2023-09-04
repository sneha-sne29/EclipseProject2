package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {

ChromeDriver driver;
	
	String url="https://demo.guru99.com/test/drag_drop.html";
	
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
		
	}
	
	@Test
	public void dropdwn()
	{
		
		WebElement src=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		
		WebElement dst=driver.findElement(By.xpath("//div[@id='shoppingCart4']/div[1]/ol"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		
	}
}
