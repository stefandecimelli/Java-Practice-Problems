package com.decimelli.interviewquestion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	Solution test = new Solution();

	@Test
	public void testRemoveElement1() {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int expected = 2;
		int actual = test.removeElement(nums, val);
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveElement2() {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int expected = 5;
		int actual = test.removeElement(nums, val);
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveElement3() {
		int[] nums = { 4, 5 };
		int val = 4;
		int expected = 1;
		int actual = test.removeElement(nums, val);
		assertEquals(expected, actual);
	}

}