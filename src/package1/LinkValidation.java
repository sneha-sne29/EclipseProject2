package package1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation {
	
	ChromeDriver driver;
	
	String url="https://www.google.com";
	
	@Before
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void links()	
	{
		driver.get(url);
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		
		System.out.println("count of links = "+li.size());
		
		for(WebElement el:li)
		{
			String link=el.getAttribute("href");
			
			validate(link);
			
		}
	}

	private void validate(String link) {
		
		try
		{
			URL u=new URL(link);
			
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			
			con.connect();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("success code --"+link);
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("broken link ---"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	

}
