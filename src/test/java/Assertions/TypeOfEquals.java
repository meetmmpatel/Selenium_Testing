package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TypeOfEquals {
	
//	AssertEqueals
//	AssertNotEqueals
	
	
	String expetedUrl = "http://google.com";
	String actualUrl = "http://google.com";
	
	@Test
	public void matchUrls() {
		Assert.assertEquals(actualUrl, expetedUrl);
	}
	
	
	

}
