package test;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Fbloginpage;
import utilities.Excelutilities;

public class Fblogintest extends Basecls {
	
	@Test
	public void login() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Fbloginpage ob=new Fbloginpage(driver);
		
		
		String xl="C:\\Users\\HP\\Desktop\\Book1.xlsx";
		String sheet="Sheet1";
		
		int rowcount=Excelutilities.getRowCount(xl, sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String uname=Excelutilities.getCellValues(xl, sheet, i, 0);
			System.out.println("username ="+uname);
			String pwd=Excelutilities.getCellValues(xl, sheet, i, 1);
			System.out.println("password ="+pwd);
			
			ob.enterValues(uname, pwd);
			ob.loginButtonClick();
			
			Thread.sleep(3000);
			driver.navigate().back();
		
		}
	
	}

}
