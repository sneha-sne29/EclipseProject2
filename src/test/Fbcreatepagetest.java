package test;

import org.testng.annotations.Test;

import basepkg.Basecls;
import page.Fbcreatepage;

public class Fbcreatepagetest extends Basecls {
	
	@Test
	public void pageCreation()
	{
		Fbcreatepage ob1=new Fbcreatepage(driver);
		ob1.createPage();
		ob1.buttonClick();
	}

}
