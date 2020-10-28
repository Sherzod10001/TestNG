package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Base;

public class Facebook extends Base {
	
		 @BeforeMethod 
		 public void BeforeMethod() {
				
		    driver.get("https://www.facebook.com/");
	}

	//@Test
	public void loginPageTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void loginPageTest2() {
		 driver.findElement(By.id("email")).sendKeys("email@gmail.com");;
		 driver.findElement(By.name("pass")).sendKeys("Password");
		
	
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();
		
	}
	
		
	}

