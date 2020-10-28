package lesson19;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Base;

public class JavaScriptPopup extends Base {
	
	@Test
	public void popupTest() throws InterruptedException {
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);

		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}
}
