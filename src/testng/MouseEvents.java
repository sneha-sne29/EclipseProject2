package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseEvents {
	
ChromeDriver driver;
	
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	
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
	
	@Test(priority=0)
	public void rtclick() throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//body[@id='authentication']/span"));
		
		Actions act=new Actions(driver);
		act.contextClick(ele);
		act.perform();
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.xpath("//body[@id='authentication']/ul/li[1]"));
		ele1.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void dbclick() throws InterruptedException
	{
		WebElement e=driver.findElement(By.xpath("//body[@id='authentication']/button"));
		
		Actions act=new Actions(driver);
		act.doubleClick(e);
		act.perform();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		String s=alert.getText();
		System.out.println("Alert is :"+s);
		alert.accept();
		Thread.sleep(2000);
		
	}

}
