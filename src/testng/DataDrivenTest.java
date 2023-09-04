package testng;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	WebDriver driver;
	String url="https://www.facebook.com";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void datadriven() throws IOException 
	{
		driver.get(url);
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println("row count is "+rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String uname=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username ="+uname);
			String pwd=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("password ="+pwd);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(uname);
			driver.findElement(By.name("pass")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			
		}
		
		
		
	}

}
