package demo;


import org.testng.annotations.*;

public class DemoOne {

//	No of annotations that testNG provide us.
	
	@BeforeTest
	public void setUp() {
		System.out.println("Before Test");
		
	}
	
	@AfterTest
	public void clenUp() {
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@Test
	public void printInfo() {
		System.out.println("Test One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}
	

}
