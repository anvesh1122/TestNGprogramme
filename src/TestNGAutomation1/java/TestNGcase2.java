package TestNGAutomation1.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGcase2 {

	
	@Test
	public void hello() {
		System.out.println("hello world");
	}
	@Test

	public void hello1() {
		System.out.println("bye world");
	}
	@BeforeMethod
	public void hello2() {
		System.out.println("Beforemethod");
	}
	@AfterMethod
 public void hello3() {
	 System.out.println("Aftermethod");
 }
}
