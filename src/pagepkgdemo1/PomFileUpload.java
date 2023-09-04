package pagepkgdemo1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomFileUpload {
	
	WebDriver driver;
	
	By buttontxt=By.xpath("//*[@id=\"pickfiles\"]/span");
	By browse=By.xpath("//div[@id='uploader']/a/span");
	
	public PomFileUpload(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String txt()
	{
		String text=driver.findElement(buttontxt).getText();
		return text;
	}
	
	public void fileBrowsing()
	{
		driver.findElement(browse).click();
	}
	
	

}
