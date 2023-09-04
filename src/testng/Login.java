package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	ChromeDriver driver;
	String url="https://demo.guru99.com/test/login.html#";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void start()
	{
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abc12");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
		
		String txt=driver.findElement(By.xpath("/html/body/div[4]/div/div/h3")).getText();
		System.out.println("After loging in the msg displayed is ---- "+txt);
	}
}
