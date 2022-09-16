package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test(groups = {"smoke"})
	public void firstTestCase() {
		System.out.println("Personal Loan First test case in TestNG");
	}

	@AfterTest
	public void cleanUpAction2() {
		System.out.println(
				"I am in AfterTest method to do some clean up action After running all the tests from Personal Loan - test");
	}

	@Test
	public void secondTestcase() {
		System.out.println("Personal Loan Second test case in TestNG");
	}

	@BeforeTest
	public void cleanUpAction() {
		System.out.println("I am in BeforeTest method to do some clean up action before running test");
	}
}
