package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		//to open Chrome browser
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");//opens google
		
		String actualtitle=d.getTitle();
		String exptitle="Google";
		
		if(actualtitle.equals(exptitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		//to open edge browser
		/*EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");*///opens amazon
		
		//to open mozilla firefox
		
		/*FirefoxDriver dr=new FirefoxDriver();
		dr.get("https://www.amazon.com");*/
	

	}

}
