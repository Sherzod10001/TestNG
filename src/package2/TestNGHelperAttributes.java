package package2;


import org.testng.annotations.Test;

public class TestNGHelperAttributes {
	
	@Test
	public void testWWW() {   //one test case 
		System.out.println("testWWW");
		
	}

	@Test
	public void testYYY2() {
		System.out.println("testYYY2");
	}

	@Test(dependsOnMethods = {"testYYY2"})
	public void testAAA() {
		System.out.println("testAAA");
	}

}
