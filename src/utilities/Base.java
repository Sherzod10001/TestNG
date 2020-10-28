package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	protected WebDriver driver;
	String driverPath = "C:\\webdrivers";
	String browserType = "chrome";
	
	 @BeforeClass 
	 public void beforeClass() {
		//System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe"); 
		//driver = new ChromeDriver(); 
	 
	 
	 if(browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath +"\\chromedriver.exe");
			driver = new ChromeDriver();
	 }else if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverPath +"\\geckodriver.exe");
			driver = new FirefoxDriver();
	 }else if (browserType.equals("IE")) {	
			System.setProperty("webdriver.ie.driver", driverPath +"\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
	 }else { 
		 System.setProperty("webdriver.chrome.driver", driverPath +"\\chromedriver.exe");
			driver = new ChromeDriver();	 }	
			
	 }
	 @AfterClass
		public void aftherClass() {
			//driver.quit();
			
		}
	 
}
