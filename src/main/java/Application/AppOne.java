package Application;

import java.util.Arrays;
import java.util.Collections;

public class AppOne {

	public String printInfo(String info) {

		return info;
	}

	public int addTwoNums(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public boolean verifyBoolean(boolean b) {
		return !b;
	}

	public boolean evenOrOdd(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public int[] reverseArray(int numbers[]) {

		Collections.reverse(Arrays.asList(numbers));

		return numbers;

	}

}
