package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	
	WebDriver driver;
	
	@FindBy(id="email") WebElement fbEmail;
	@FindBy(id="pass") WebElement fbPwd;
	@FindBy(name="login") WebElement fbLogin;
	
	
	/*By fbemail=By.id("email");
	By fbpwd=By.id("pass");
	By fblogin=By.name("login");*/
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterValues(String email,String pwd)
	{
		fbEmail.clear();
		fbEmail.sendKeys(email);
		fbPwd.clear();
		fbPwd.sendKeys(pwd);
	}
	
	public void loginButtonClick()
	{
		fbLogin.click();
	}

}
