package com.decimelli.interviewquestion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	Solution test = new Solution();
	Solution test2 = new Solution();
	Solution test3 = new Solution();

	@Test
	public void testRemoveDuplicates1() {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int[] expected = { 1, 1, 2, 2, 3 };
		int result = test.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void test2RemoveDuplicates1() {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int[] expected = { 1, 1, 2, 2, 3 };
		int result = test2.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void test3RemoveDuplicates1() {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int[] expected = { 1, 1, 2, 2, 3 };
		int result = test3.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}
}
