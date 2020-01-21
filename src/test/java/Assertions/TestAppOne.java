package Assertions;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import Application.AppOne;

public class TestAppOne {

	AppOne app = new AppOne();

	@Test
	public void testPrintInfo() {

		String expectedTest = app.printInfo("TestPrint");

		assertEquals("TestPrint", expectedTest);
		assertNotEquals("NotTheSame", expectedTest);

	}

	@Test
	public void testAddTwoNums() {

		int actualTest = app.addTwoNums(5, 5);

		assertEquals(actualTest, 10);
		assertNotEquals(actualTest, 12);

	}

	@Test
	public void testVerifyBoolean() {
		assertTrue(app.verifyBoolean(false));
		assertFalse(app.verifyBoolean(true));

	}

	@Test
	public void testEvenOrOdd() {
		assertTrue(app.evenOrOdd(20));
		assertFalse(app.evenOrOdd(23));

	}

	@Test
	public void testReverseArray() {

	}

}
