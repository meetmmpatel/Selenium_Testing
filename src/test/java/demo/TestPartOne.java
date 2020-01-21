package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPartOne {

	@Test
	public void checkTheNums() {
		float square = 2 * 1;
		float rectangle = 2 * 1;

		Assert.assertEquals(square, rectangle);

	}
	
	

}
