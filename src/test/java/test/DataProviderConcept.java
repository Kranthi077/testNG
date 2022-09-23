package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	@Test(dataProvider = "loginCredentials")
	public void loginToHdfc(String username, String password, String url) {

		System.out.println(username);
		System.out.println(password);
		System.out.println(url);
	}

	@DataProvider
	public Object[][] loginCredentials() {

		Object[][] Credentials = new Object[3][3];
		Credentials[0][0] = "Manager";
		Credentials[0][1] = "Password1";
		Credentials[0][2] = "URL1";
		
		Credentials[1][0] = "employee";
		Credentials[1][1] = "Password2";
		Credentials[1][2] = "URL2";
		
		Credentials[2][0] = "customer";
		Credentials[2][1] = "Password3";
		Credentials[2][2] = "URL3";
		return Credentials;
		
		

	}

}
