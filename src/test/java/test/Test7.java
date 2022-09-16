package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test7 {

	@BeforeMethod(groups = { "smoke" })
	public void logIntoAmazonApplication() {
		System.out.println("Driver is in logIntoAmazonApplication method");
	}

	@AfterMethod
	public void logOutofAmazonApplication() {
		System.out.println("Driver is in logOutofAmazonApplication method");
	}

	@Test(groups = { "smoke" })
	public void amazonSearchBarTest() {
		System.out.println("Driver is in amazonSearchBarTest");
	}

	@Test(groups = { "smoke" })
	public void amazonCartOptionTest() {
		System.out.println("Driver is in amazonCartOptionTest");
	}

	@Test
	public void amazonContactUsPage() {
		System.out.println("Driver is in amazonContactUsPage");
	}

}
