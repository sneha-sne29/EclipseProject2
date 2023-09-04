package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPaste {
	
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
	
	@Test
	public void copypaste()
	{
		WebElement fname=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		fname.sendKeys("abc");
		
		WebElement id=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
		
		Actions act=new Actions(driver);
		//to select the name at fullname field(ctrl+a)
		act.keyDown(fname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		
		//copy name from fullname (ctrl+c)
		act.keyDown(fname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		
		//paste name to rediffid (ctl+v)
		act.keyDown(id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		act.perform();
		
	}
	
	@AfterTest
	public void stop()
	{
		driver.quit();
	}

	
}
