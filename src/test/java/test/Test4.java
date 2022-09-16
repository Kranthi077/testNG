package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Test4 {

	@BeforeClass
	public void pickTheCarLoanUserCredentials() {
		System.out.println("Driver is in BeforeClass Method to pick car loan credentials");

	}

	@AfterClass
	public void removeCarLoanCredentials() {
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

	@Test(groups = {"smoke"})
	public void carLoanPageWebLogout() {
		System.out.println("Car loan web page logout successful");
	}

	@Test
	public void carLoanPageMobileLogin() {
		System.out.println("Car loan Mobile page login successful");
	}

	@Test(groups = {"smoke"})
	public void carLoanPageMobileSearchProducts() {
		System.out.println("Car loan Mobile page SearchProduct Methods");
	}

	@Test
	public void carLoanPageMobileLogout() {
		System.out.println("Car loan Mobile page logout successful");
	}

}
