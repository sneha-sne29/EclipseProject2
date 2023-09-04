package package1;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrnshotOfPage {
	
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
		
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("F://Amazonss.png"));
		
		
		
	}

}
