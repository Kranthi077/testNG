package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

	@Test(enabled = true)
	public void homeLoanPageLogin() {
		System.out.println("Home loan page login successful");
		assertTrue(false);
	}
	
	@Parameters({ "URL" })
	@Test 
	public void homeLoanPageSearchProducts(String url) {
		System.out.println(url);
		System.out.println("Home loan page SearchProduct Methods");
	}

	@Test (groups = {"smoke"})
	public void homeLoanPageLogout() {
		System.out.println("Home loan page logout successful");
	}

	@BeforeSuite
	public void setDownloadDirectoryPath() {
		System.out.println("I am in Before suit to stup download directory path for files");
	}

}
