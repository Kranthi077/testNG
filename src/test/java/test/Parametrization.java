package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

	@Parameters({ "URL" , "username" })
	@BeforeClass
	public void pickTheCarLoanUserCredentials(String hdfcUrl, String user) {
		System.out.println(hdfcUrl);
		System.out.println(user);
		System.out.println("Driver is in BeforeClass Method to pick car loan credentials");

	}

	@Parameters({ "URL" })
	@AfterClass
	public void removeCarLoanCredentials(String hdfcUrl) {
		System.out.println(hdfcUrl);

		System.out.println("Driver is in After Class Method to delete car loan credentials");

	}
	
	@Test
	public void carLoanPageWebLogin() {
		System.out.println("Car loan web page login successful");
	}

	@Test
	public void carLoanPageWebSearchProducts() {
		System.out.println("Car loan web page SearchProduct Methods");
	}

	@Test
	public void carLoanPageWebLogout() {
		System.out.println("Car loan web page logout successful");
	}

	@Test
	public void carLoanPageMobileLogin() {
		System.out.println("Car loan Mobile page login successful");
	}

	@Test
	public void carLoanPageMobileSearchProducts() {
		System.out.println("Car loan Mobile page SearchProduct Methods");
	}

	@Test
	public void carLoanPageMobileLogout() {
		System.out.println("Car loan Mobile page logout successful");
	}

}
