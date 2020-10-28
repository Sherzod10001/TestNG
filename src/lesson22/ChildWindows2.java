package lesson22;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Base;

public class ChildWindows2 extends Base {

	@Test
	public void childWinTest() {
		driver.get("https://learn.letskodeit.com/p/practice");
		System.out.println("Parent win: " + driver.getTitle());
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> iterator = winId.iterator();
		String parentWindId = iterator.next();
		String childWinId = iterator.next();
		
		driver.switchTo().window(childWinId);
		System.out.println("Child win " + driver.getTitle());
		driver.findElement(By.id("search-courses")).sendKeys("abc");
		
		driver.close();
		driver.switchTo().window(parentWindId);
		driver.findElement(By.id("name")).sendKeys("parent window");
	}
}
