package test;

import org.testng.annotations.Test;

public class DependsOnMethodsDemo {

	@Test(dependsOnMethods = { "b_test" })
	public void a_test() {
		System.out.println("a_test logout");
	}

	@Test
	public void b_test() {
		System.out.println("b_test login");
	}
}
