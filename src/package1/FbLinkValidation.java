package package1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLinkValidation {

ChromeDriver driver;
	
	String url="https://www.facebook.com";
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void links()	
	{
		driver.get(url);
		
		validate(url);
		
	}

	private void validate(String url) {
		
		try
		{
			URL u=new URL(url);
			
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			
			con.connect();
			
			System.out.println("Response code is : "+con.getResponseCode());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
