package testng;

import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	
    ChromeDriver dr;
	
	String url="https://www.amazon.in";
	
	@BeforeTest
	public void setup()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		dr.get(url);
		
		String frstwindow=dr.getWindowHandle();
		
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("mobilephones",Keys.ENTER);
		
		String s=dr.getTitle();
		String s1="Amazon.in : mobilephones";
		if(s1.equals(s))
		{
			System.out.println("title is same as expected");
		}
		else
		{
			System.out.println("title is not same");
		}
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		dr.findElement(By.xpath("//div[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div/h2/a")).click();
		
		
		Set<String> scndwindow=dr.getWindowHandles();
		for(String st:scndwindow)
		{
			if(!st.equalsIgnoreCase(frstwindow))
			{
				dr.switchTo().window(st);
				dr.findElement(By.id("add-to-cart-button")).click();
				
				//to scroll down
				
				JavascriptExecutor js=(JavascriptExecutor)dr;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
				dr.findElement(By.xpath("//div[@id='navFooter']/div[1]/div/div[7]/ul/li[6]/a")).click();
				
				dr.close();
				
			}
		}
		
		dr.switchTo().window(frstwindow);
		
		dr.findElement(By.id("nav-cart-count")).click();
		
		//dr.quit();
		
	}

}
