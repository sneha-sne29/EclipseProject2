package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EBay {
	
ChromeDriver driver;
	
	String url="https://www.ebay.com";
	
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
	public void test1()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li/a")));
		driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li/a")).click();
	}
	

}
