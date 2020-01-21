package seleniumTests;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import base.WebDriverConfig;

public class BasicsCommand extends WebDriverConfig {

//	Write the code on how to navigate browser

	@Test
	public void testInfo() {

//		Open the browser
		driver.get("https://selenium.dev");

//		Open the browser in full screen or maximum mode
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();

//		How to minimize the browser
		driver.manage().window().setPosition(new Point(0, -600));

//		How to refresh or back and forward the browser
		driver.navigate().refresh();
		driver.get("http://yahoo.com");
		driver.navigate().forward();
		driver.navigate().back();

	}

}
