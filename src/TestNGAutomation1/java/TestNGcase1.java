package TestNGAutomation1.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGcase1 {

	@Test(groups={"anvesh"})
	public void main() {
		System.out.println("result");
	}

	@Test(groups={"vesh"})
	public void main1() {
		System.out.println("Exam");
	}
@BeforeMethod
	public void main2()
	{	
		System.out.println("passed");
		}
@AfterMethod
	public void main3() {
		System.out.println("failed");
	}
	
	}
	

