package testpkgdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkgdemo1.PomFileUpload;

public class PomFileuploadtest {
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void upload() throws Exception 
	{
		PomFileUpload obj=new PomFileUpload(driver);
		
		String s=obj.txt();
		System.out.println("Text displayed on button is "+s);
		
		obj.fileBrowsing();	
		Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\Autoitfolder\\T1.exe");
	}
	
	

}
