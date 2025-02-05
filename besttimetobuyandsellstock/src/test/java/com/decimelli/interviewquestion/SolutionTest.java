package com.decimelli.interviewquestion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	Solution test1 = new BruteTwoIndexSolution();

	@Test
	public void testMaxProfit1() {
		int[] example = { 7, 1, 5, 3, 6, 4 };
		int expected = 5;
		int result = test1.maxProfit(example);
		assertEquals(expected, result);
	}

	@Test
	public void testMaxProfit2() {
		int[] example = { 7, 6, 4, 3, 1 };
		int expected = 0;
		int result = test1.maxProfit(example);
		assertEquals(expected, result);
	}

	Solution test2 = new KadaneSolution();

	@Test
	public void test2MaxProfit1() {
		int[] example = { 7, 1, 5, 3, 6, 4 };
		int expected = 5;
		int result = test2.maxProfit(example);
		assertEquals(expected, result);
	}

	@Test
	public void test2MaxProfit2() {
		int[] example = { 7, 6, 4, 3, 1 };
		int expected = 0;
		int result = test2.maxProfit(example);
		assertEquals(expected, result);
	}
}
