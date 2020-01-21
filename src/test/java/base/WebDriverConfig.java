package base;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class WebDriverConfig {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		System.out.println("Please enter the your of your browser ");
		System.out.println("Enter 1 for Chrome 2 for FireFox");
//		Scanner scan = new Scanner(System.in);
//		int browser = scan.nextInt();
		int browser = 1;
		if (browser == 1) {

			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();

		} else {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException e) {
				System.out.println("Please enter valid value");
			}

		}

	}
	
	@AfterSuite
	public void cleanUp() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
	

}
