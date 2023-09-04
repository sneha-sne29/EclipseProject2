package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	
	ChromeDriver dr;
	
	String url="https://amazon.in";
	
	@Before
	public void setup()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		dr.get(url);
		
		dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);//mobiles
		
		dr.findElement(By.xpath("//span[@id='nav-cart-count']")).click();//cart
		
		dr.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();//hello sign in
		
		dr.navigate().back();//redirects to previous page
		
		dr.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();//mobiles
		
		
		dr.findElement(By.xpath("//div[@id='nav-main']/div[1]/a/i")).click();//hamburger
		
	}

}
