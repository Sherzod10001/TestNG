package package2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.Base;

public class ParameterTest extends Base {
	//String url = "https://www.google.com/"; -- delete this after add in xml
	
	@Parameters({"URL", "UserName"}) 
	
	@Test
	public void searchTest(String url, String loginName) { 
		System.out.println(url);
		System.out.println(loginName);
	}

	@Parameters({"USerPassword", "Amount"}) 
	
	@Test
	public void searchTest2(String pass, String amount) { 
		System.out.println(pass);
		System.out.println(amount);
	}
}
