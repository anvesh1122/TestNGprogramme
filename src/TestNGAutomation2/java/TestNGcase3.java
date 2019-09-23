package TestNGAutomation2.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGcase3 {

	@Test
	public void control() {
		System.out.println("for loop");
	}
	@Test
	public void control1() {
		System.out.println("if else");
	}
		
	    @BeforeClass
		public void control2() {
			System.out.println("Beforeclass");
		}
		@AfterClass
		public void control3() {
			System.out.println("afterclass");
	}

}
