package package1;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndText {
	
ChromeDriver d;
	
	String url="https://www.google.com";
	
	@Before
	public void setup()
	{
		d=new ChromeDriver();
	}
	
	@Test
	public void start()
	{
		d.get(url);
		
		List<WebElement> li=d.findElements(By.tagName("a"));
		
		for(WebElement tx:li)
		{
			System.out.println(tx.getText()+" - "+tx.getAttribute("href"));
			
			
		
		
	}
}


}
