package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/a") WebElement createlink;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div") WebElement getstrtbutton;
	
	/*By createlink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstrtbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");*/
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void createPage()
	{
		createlink.click();
	}
	
	public void buttonClick()
	{
		getstrtbutton.click();
	}

}
