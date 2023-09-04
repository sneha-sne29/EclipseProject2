package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
ChromeDriver d;
	
	String url="file:///C:/Users/HP/Desktop/alert.html";
	
	@Before
	public void setup()
	{
		d=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		d.get(url);
		
		d.findElement(By.xpath("/html/body/input[1]")).click();
		d.switchTo().alert().accept();
		
		d.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		
		d.findElement(By.xpath("/html/body/input[3]")).sendKeys("Z");
		
		d.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
