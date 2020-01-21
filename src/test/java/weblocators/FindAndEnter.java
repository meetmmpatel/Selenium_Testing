package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.WebDriverConfig;

public class FindAndEnter extends WebDriverConfig {

	/*
	 * Test Case..
	 * 
	 * Step One: Open the Chrome browser and go to lambdatest.com Step Two: find the
	 * email provider box and enter valid email address Step Three: find the start
	 * freeTesting button and click Step Four: verify that email address is
	 * accepted.
	 * 
	 */

//	@Test
	public void emailForFreeTesting() {
//		Step One: 
		driver.get("https://lambdatest.com/");
//      Step Two: 
		driver.findElement(By.id("useremail")).sendKeys("demo@test.com");
//      Step Three:
		driver.findElement(By.cssSelector("#testing_form > div > button")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String expectedURL = "https://accounts.lambdatest.com/register?email=demo@test.com";
		String actualURL = driver.getCurrentUrl();

		Assert.assertEquals(actualURL, expectedURL);

	}

//	Test the Navigation Links and page of web site 
//	Step One: Open the Browser and Web site
//  Step Two: Click on each page link and verify the URL

	@Test
	public void testNavigatonBar() {

		String homePage = "https://www.lambdatest.com/";
		driver.get(homePage);

	}

}
