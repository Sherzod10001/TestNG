package lesson19;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;

public class SpiceJet extends Base {
	
	@Test
	public void TestDrp()throws InterruptedException {
	driver.get("https://www.cheapoair.com/");
	
	/*
	 * driver.findElement(By.xpath("//input[@id='from0']")).sendKeys("jf");
	 * Thread.sleep(2000);
	 * 
	 * driver.findElement(By.xpath("//input[@id='from0']")).sendKeys(Keys.ENTER);
	 * //run
	 */	
	WebElement elem1 = driver.findElement(By.xpath("//input[@id='onewayTrip']")).click();
	//run
	boolean isRoundTripSelected = driver.findElement(By.xpath("//input[@id='roundTrip']")).isSelected();

	//a[@class=' month-date date-space is--today is--depart']

	//Assert.assertEquals("google", "google", "Actual should be equal to expected");
	//Assert.assertFalse(5>6, "Comparing 5 to 6");// passes
	Assert.assertTrue(isRoundTripSelected, "isRoundTripSelected");
	String currentDate = elem1.getAttribute("date-date");
	 //int toDate = currentDate +3;
	
	driver.findElement(By.xpath("//a[@data-data='']"));

	}
// String str = "28";
	//Int intValue = integer.parseInt(str);
	//int Value++;
	// System.out.println(intValue);
}
