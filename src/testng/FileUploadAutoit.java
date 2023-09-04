package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoit {

	ChromeDriver driver;
	String url="https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void upload() throws Exception
	{
		driver.get(url);
		driver.findElement(By.xpath("//div[@id='uploader']/a/span")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\Autoitfolder\\T1.exe");
	}
}
