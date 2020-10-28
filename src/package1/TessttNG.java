package package1;

import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class TessttNG {
	public String baseUrl = "https://www.facebook.com/";
	String driverPath = "C:\\webdrivers\\chromedriver.exe";
	public WebDriver driver;
	
	
	@Before
	public void beforeTest() {
		System.out.println("launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		
		
	}

	@After
	public void afterTest() {
		driver.close();
	}
	@BeforeClass
	public static void beforeClass() {
		//String url = "https://www.facebook.com/";
	
	//}
	//@AfterClass
	//public static void afterClass() {
		//System.out.println("After class");
		
	}
	@Test
	public void test2() {
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
		
		
	}

