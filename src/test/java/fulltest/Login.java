package fulltest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.WebDriverConfig;

public class Login extends WebDriverConfig {

//	Test for Invalid User name and Password provided

//	Test: Invalid user name
//	Step One: Open Home page of HRM in Chrome
//	Step Two: Provide Invalid User name and Password
//	Step Three: Click on Submit button
//	Step Four: Verify that user see "invalid credentials" message

	@Test(priority = 1)
	public void invalidUserPassTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//*[@id='txtUsername']")).clear();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admmm");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin456");
		driver.findElement(By.id("btnLogin")).click();

		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		String expectedMessage = "Invalid credentials";

		Assert.assertEquals(actualMessage, expectedMessage);

	}

//	Test: Check is User or Password is empty and verify
//	Step One: Open Home page in chrome 
//	Step Two: Ensure that User name is empty box
//	Step Three: click on submit button and verify the error message

	@Test(priority = 2)
	public void userPasswordEmpty() {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		String userName = driver.findElement(By.id("txtUsername")).getText();

		if (userName.isEmpty()) {
			driver.findElement(By.id("btnLogin")).click();
			String errorMessage = driver.findElement(By.id("spanMessage")).getText();
			String expectedMessge = "Username cannot be empty";
			Assert.assertEquals(errorMessage, expectedMessge);
			System.out.println("User name test passed");
		} else {
			System.out.println("Username is not empty");
		}

		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admmm");
		String passWord = driver.findElement(By.id("txtPassword")).getText();

		if (passWord.isEmpty()) {
			driver.findElement(By.id("btnLogin")).click();
			String errorMessage = driver.findElement(By.id("spanMessage")).getText();
			String expectedMessge = "Password cannot be empty";
			Assert.assertEquals(errorMessage, expectedMessge);
			System.out.println("password test passed");

		} else {
			System.out.println("Password is not empty");

		}

	}

	/*
	 * Step One: Open chrome and HRM web site Step Two: go to home page Step Three:
	 * find and enter user name and password Step Four: click on submit button to
	 * authenticate Step Five: verify that test has been authenticated
	 */

	@Test(priority = 3)
	public void loginValidation() {
//		Step One;
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		Step Two:
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

		Assert.assertEquals(actualURL, expectedURL);

	}

}
