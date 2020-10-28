package practice;

import org.testng.annotations.Test;

import utilities.Base;

public class GoogleTest extends Base {
	
	@Test
	public void testGooglePage() {
		driver.get("https://www.google.com/");
	}

}
