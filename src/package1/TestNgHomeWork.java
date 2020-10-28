package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNgHomeWork {
	WebDriver driver; 
	
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	  @After public void afterTest() { 
		  driver.close();
	  }
	/*
	 * @BeforeClass public static void beforeClass() {
	 * System.out.println("BeforeClass");
	 */
	/*
	 * }
	 * 
	 * @org.junit.AfterClass public static void afterClass() {
	 * System.out.println("AfterClass");
	 */
	//}
	@Test
	public void Test1() {
		String title = driver.getTitle();
		System.out.println(title);
		}
		 @Test public void Test2() { 
			 driver.findElement(By.id("email")).sendKeys("email@gmail.com");;
			 driver.findElement(By.name("pass")).sendKeys("Password");
		 }
		 
	}

