package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtendedReports {
	WebDriver driver;
	
	String url="https://www.facebook.com";
	
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void setRpt()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport.html");
		reporter.config().setDocumentTitle("AutomationReport");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("Browser Name", "chrome");
		
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void start()
	{
		driver.get(url);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("FbTitleVerification");
		String exp="Facebook";
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
		
	}
	
	@Test
	public void fblogoverification()
	{
		test=extent.createTest("FbLogoVerification");
		Boolean b=driver.findElement(By.xpath("//div[@id='globalContainer']/div/div/div/div[1]/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void rslts(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test case failed is "+result.getName());
			test.log(Status.FAIL, "Exception thrown is "+result.getThrowable());	
			
			String screenshotpath=screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case skipped is "+result.getName());
			test.log(Status.SKIP,"Exception thrown is "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case passed is "+result.getName());			
		}
	}
	
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest="./Screenshot/"+screenshotname+".png";
		FileHandler.copy(src, new File(dest));
		
		return dest;
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
		driver.quit();
	}

}
