 package lesson22;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Base;

public class ChildWindow extends Base {

	
	@Test
	public void childWinTest() {
		
		driver.get("https://learn.letskodeit.com/p/practice");//1
		
		 System.out.println("Parent win: " + driver.getTitle());//5
		 String parentWinId = driver.getWindowHandle();//7 
		driver.findElement(By.id("openwindow")).click();//2
		
		Set<String> winIds = driver.getWindowHandles();//8 would belong to parentWindID and second set would belong to child wind
		String childWinId = "";//12

		for(String id : winIds) { //9
			if(!id.equals(parentWinId)) { //10
				childWinId = id;//11
			}
		}
		driver.switchTo().window(childWinId);//4 // 12
		 System.out.println("Child win: " + driver.getTitle());//6

		driver.findElement(By.id("search-courses")).sendKeys("abc");//3
		
		driver.close();//13
		driver.switchTo().window(parentWinId);//14
		driver.findElement(By.id("name")).sendKeys("parent window"); //16
	}
	

}
