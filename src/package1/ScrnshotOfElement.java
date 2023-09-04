package package1;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrnshotOfElement {
	
	
ChromeDriver dr;
	
	String url="https://amazon.in";
	
	@Before
	public void setup()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException
	{
		dr.get(url);
		
		WebElement ele=dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		File sc=ele.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(sc, new File("./Elementss/ssofsearch.png"));
		
		
		
	}


}
