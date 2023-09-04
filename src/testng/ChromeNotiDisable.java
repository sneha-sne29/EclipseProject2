package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeNotiDisable {

	ChromeDriver driver;
	String url="https://www.justdial.com";
	
	@BeforeTest
	public void set()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
	}
	
	@Test
	public void disablenotification()
	{
		driver.get(url);
	}
}
