package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.Base;

public class Dropdown extends Base{
	@Test
	public void selectCoach() throws InterruptedException {
		driver.get("https://www.cheapoair.com/flights/");
		
		driver.findElement(By.xpath("//a[@id='travellerButton']")).click();
		Thread.sleep(2000);
		
		//WebElement passNum = driver.findElement(By.xpath(""));
	Select classDrp = new Select(driver.findElement(By.xpath("//select[@name='Class']")));
	
	//Select PassangerNum = new Select(passNum);
	//classDrp.selectByIndex(2);// can be change "swap place" that why not used by this way 
	//classDrp.selectByValue("1");
	
	classDrp.selectByVisibleText("First");
	
 
	  for(int i = 0; i < 5; i++) {
	  driver.findElement(By.xpath("//button[@id='addadults']")).click();
	//classDrp.deselectAll();
	//classDrp.deselectByVisibleText(arg0);
	  }
	
	}
	

}
//select[name='Class'] 
//deselectall when dropdown can be multioptional multiselecteble
