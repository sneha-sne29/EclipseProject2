package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadRobot {
	
	ChromeDriver driver;
	String url="https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void start() throws Exception
	{
		driver.get(url);
		
		driver.findElement(By.xpath("//div[@id='uploader']/a/span")).click();
		
		fileupload("C:\\Users\\HP\\Downloads\\SQL INTERVIEW QUESTIONS AND ANSWERS.docx");
		
	}

	public void fileupload(String path) throws AWTException {
		StringSelection strsele=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsele, null);
		
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
