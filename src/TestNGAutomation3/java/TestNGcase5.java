package TestNGAutomation3.java;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGcase5 {

	
	@Test
	public void oops() {
		System.out.println("Inheritance");
	}
	
	@Test
	public void oops1() {
		System.out.println("abstraction");
	}
	@BeforeSuite
	public void oops2() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void oops3() {
		System.out.println("after suite");
	}

}
