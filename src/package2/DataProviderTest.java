package package2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "getCredentials")
	public void testDataPr(String username, String password) {
		System.out.println("UserName = " + username);
		System.out.println("Password = " + password);// how many times run? will run столько сколько захочет 

		
		
	}

	//surat112 pass456
	//SherUzb Pa$$33
	@DataProvider
	public Object[][] getCredentials(){
	Object[][] data = new Object[3][2];
	//first line
	data[0][0] = "Surat112";
	data[0][1] = "Pass456";
	//second line 
	data[1][0] = "SherUzb";
	data[1][1] = "Pa$$33";
	//third line
	data[2][0] = "UserName";
	data[2][1] = "dkdkdkd";

	return data;
	}
	@Test(dataProvider = "getNumbers")
	public void testDataPr2(String username, String password) {
		System.out.println("UserName = " + username);
		System.out.println("Password = " + password);// how many times run? will run  

		
	
	}
	@DataProvider
	public Object[][] getNumbers(){
	Object[][] data = new Object[6][2];//
	//first line
	data[0][0] = "ghhghghg";
	data[0][1] = "gld332";
	//second line 
	data[1][0] = "fdvdvd";
	data[1][1] = "P3333";
	//third line
	data[2][0] = "fdgvdvd";
	data[2][1] = "vdvdgefw";

	return data;
	}
	
	
}
