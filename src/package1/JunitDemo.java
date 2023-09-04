package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	
	String baseurl="https://www.google.com";
	
	ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test1()
	{
		dr.get(baseurl);
		
		String actualtitle=dr.getTitle();
		
		String exptitle="Google";
		
		if(exptitle.equals(actualtitle))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
	
	@After
	public void stop()
	{
		dr.quit();
	}
	

}
