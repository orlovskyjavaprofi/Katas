package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Dinglemouse;

class DinglemouseTest
{
	Dinglemouse objAtTest;

	@BeforeEach
	void setup()
	{
		objAtTest = new Dinglemouse();
	}

	@Test
	void testIfDinglemouseExist()
	{
		assertNotNull(objAtTest);
	}
	
	@Test
	void checkIfYearsOfHumanCalculatedPositive() {

		int inputHumanyears = 10;
		int [] expectedResult = new int[] {10,56,64};
		int [] actualResult = Dinglemouse.humanYearsCatYearsDogYears(inputHumanyears);
		
//		iterateOverArr(expectedResult);
//		iterateOverArr(actualResult);
		
		assertArrayEquals(expectedResult, actualResult, "the expected result is not met");
	}
	
	@Test
	void checkIfYearsOfHumanCalculatedBoundary() {

		int inputHumanyears = 0;
		int [] expectedResult = new int[] {0,15,15};
		int [] actualResult = Dinglemouse.humanYearsCatYearsDogYears(inputHumanyears);
		
//		iterateOverArr(expectedResult);
//		iterateOverArr(actualResult);

		assertArrayEquals(expectedResult, actualResult, "the expected result is not met");
	}
	
	@Test
	void checkIfYearsOfHumanCalculatedCornerCases() {

		int inputHumanyears = 2;
		int [] expectedResult = new int[] {2,24,24};
		int [] actualResult = Dinglemouse.humanYearsCatYearsDogYears(inputHumanyears);
		
//		iterateOverArr(expectedResult);
//		iterateOverArr(actualResult);

		assertArrayEquals(expectedResult, actualResult, "the expected result is not met");
	}

	private void iterateOverArr(int[] inputArr)
	{
		for (int i : inputArr)
		{
			System.out.println(i);
		}
	}

}
