package TestNGAutomation2.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGcase4 {

	@Test
	public void access() {
		System.out.println("public");
	}
	@Test
	
	public void access1() {
		System.out.println("private");
	}
	@BeforeMethod
	public void access2() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void access3() {
		System.out.println("aftermethod");
	}

}
