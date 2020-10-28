package package1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	//@Test
	//@BeforeMethod
	//@AfterMethod
	//@BeforeClass
	//@AfterClass
	//@BeforeSuite
	//@AfterSuite
	//@BeforeTest
	//AfterTest
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeClass 
	public void beforeClass() {
		System.out.println("Before Test for Package 1");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod    // means run each time before any test 
	public void BeforeMethod() {
		System.out.println("Before Method");
		
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
		
	}
	@Test
	public void myTestCase1() {
		System.out.println("myTestCase");
		
	}
	@Test(groups = {"Smoke", "Regression"})
	public void myTestCase2() {
		Assert.assertTrue(false);
	}
	@AfterSuite 
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
