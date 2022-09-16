package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void homeLoanPageLogin() {
		System.out.println("Home loan page login successful");
	}

	@Test
	public void homeLoanPageSearchProducts() {
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
