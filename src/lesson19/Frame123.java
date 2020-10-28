package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.Base;

public class Frame123 extends Base {
	
	@Test
	public void testIFrame() {
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframeElem = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//int numOfFrames = driver.findElements(By.tagName("iframe")).size();// currently we have one iframe
		//System.out.println(numOfFrames);
		
		//driver.switchTo().frame(iframeElem);
		//driver.switchTo().frame(0);// find element by index'
		
		
		
		
		Actions  actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.xpath("//a[text()='Contribute']"))).build().perform();	
		
		actions.click(driver.findElement(By.xpath("//input[@name='s']"))).keyDown(Keys.SHIFT).sendKeys("capital letters").build().perform();
		
		//WebElement source = driver.findElement(By.id("draggable"));
		//WebElement target = driver.findElement(By.id("draggable"));
		
		//actions.dragAndDrop(source, target).build().perform();
		
		//driver.findElement(By.id("draggable")).click();
		//driver.switchTo().defaultContent();
		
	
	}

}
