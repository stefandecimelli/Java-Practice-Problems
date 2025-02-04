package com.decimelli.interviewquestion;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

	Solution test = new BruteForceSolution();

	@Test
	public void testRotate1() {
		int[] testNums = { 1, 2, 3, 4, 5, 6, 7 };
		int testK = 3;
		int[] expectedNums = { 5, 6, 7, 1, 2, 3, 4 };
		test.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void testRotate2() {
		int[] testNums = { -1, -100, 3, 99 };
		int testK = 2;
		int[] expectedNums = { 3, 99, -1, -100 };
		test.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	Solution test2 = new BufferedSolution();

	@Test
	public void test2Rotate1() {
		int[] testNums = { 1, 2, 3, 4, 5, 6, 7 };
		int testK = 3;
		int[] expectedNums = { 5, 6, 7, 1, 2, 3, 4 };
		test2.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void test2Rotate2() {
		int[] testNums = { -1, -100, 3, 99 };
		int testK = 2;
		int[] expectedNums = { 3, 99, -1, -100 };
		test2.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void test2Rotate3() {
		int[] testNums = { 1, 2 };
		int testK = 3;
		int[] expectedNums = { 2, 1 };
		test2.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	Solution test3 = new ThreeReversalSolution();

	@Test
	public void test3Rotate1() {
		int[] testNums = { 1, 2, 3, 4, 5, 6, 7 };
		int testK = 3;
		int[] expectedNums = { 5, 6, 7, 1, 2, 3, 4 };
		test3.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void test3Rotate2() {
		int[] testNums = { -1, -100, 3, 99 };
		int testK = 2;
		int[] expectedNums = { 3, 99, -1, -100 };
		test3.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void test3Rotate3() {
		int[] testNums = { 1 };
		int testK = 0;
		int[] expectedNums = { 1 };
		test3.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void test3Rotate4() {
		int[] testNums = { 1, 2 };
		int testK = 3;
		int[] expectedNums = { 2, 1 };
		test3.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}

	@Test
	public void test3Rotate5() {
		int[] testNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27 };
		int testK = 38;
		int[] expectedNums = { 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 16 };
		test3.rotate(testNums, testK);
		assertArrayEquals(expectedNums, testNums);
	}
}
