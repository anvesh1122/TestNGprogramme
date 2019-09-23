package TestNGAutomation3.java;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGcase6 {

	@Test
	public void designpattern() {
		System.out.println("TestNG");
	}
	
	@Test
	
	public void designpattern1() {
	System.out.println("Junit");	
	}
	
	@BeforeMethod
	public void designpattern2() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void designpattern3() {
		System.out.println("After method");
	}

}
