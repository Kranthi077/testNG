package test;

import org.testng.annotations.Test;

public class PrioritizationDemo {

	@Test(priority = -9)
	public void a_test() {
		System.out.println("a_test ");
	}

	@Test(priority = -10)
	public void b_test() {
		System.out.println("b_test ");
	}

	@Test(priority = -1)
	public void c_test() {
		System.out.println("c_test ");
	}

	@Test(priority = 1)
	public void e_test() {
		System.out.println("e_test ");
	}

}
