package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpom {
	ChromeDriver driver;
	String url="https://demo.automationtesting.in/FileUpload.html";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void upload() throws Exception
	{
		driver.get(url);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]/span")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\Autoitfolder\\Demoupload.exe");
	}

}
