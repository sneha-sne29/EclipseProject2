package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterization {
	
	@Parameters({"a","b"})
	
	
	@Test
	public void test1(String a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}
