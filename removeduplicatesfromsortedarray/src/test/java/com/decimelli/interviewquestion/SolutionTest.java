package com.decimelli.interviewquestion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	Solution test = new Solution();
	Solution2 test2 = new Solution2();

	@Test
	public void testRemoveDuplicates1() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] expected = { 1, 2, 3, 4, 5 };
		int result = test.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void test2RemoveDuplicates1() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] expected = { 1, 2, 3, 4, 5 };
		int result = test2.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void testRemoveDuplicates2() {
		int[] nums = { 1, 1, 2 };
		int[] expected = { 1, 2 };
		int result = test.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void test2RemoveDuplicates2() {
		int[] nums = { 1, 1, 2 };
		int[] expected = { 1, 2 };
		int result = test2.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void testRemoveDuplicates3() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expected = { 0, 1, 2, 3, 4 };
		int result = test.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	public void test2RemoveDuplicates3() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expected = { 0, 1, 2, 3, 4 };
		int result = test2.removeDuplicates(nums);

		assertEquals(expected.length, result);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}
}
