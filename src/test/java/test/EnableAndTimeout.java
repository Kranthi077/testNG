package test;

import org.testng.annotations.Test;

public class EnableAndTimeout {

	@Test(timeOut = 10000)
	public void a_test() {
		System.out.println("a_test ");
	}

	@Test(enabled = true)
	public void b_test() {
		System.out.println("b_test ");
		int i = 1 / 0;
	}

	@Test
	public void c_test() {
		System.out.println("c_test ");
	}

	@Test
	public void d_test() {
		System.out.println("e_test ");
	}

}
