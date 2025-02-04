package com.decimelli.interviewquestion;

/**
 * Leetcode submission: 3ms (beats 8.59%), 57.49MB (beats 50.18%)
 */
public class ThreeReversalSolution implements Solution {

	@Override
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		int steps = k % n;
		if (steps == 0) {
			return;
		}
		for (int i = 0; i < n / 2; i++) {
			swap(nums, i, n - i - 1); // Reverse the whole array
		}
		for (int i = 0; i < steps / 2; i++) {
			swap(nums, i, steps - i - 1); // Reverse the first K elements
		}
		for (int i = 0; i < (n - steps) / 2; i++) {
			swap(nums, i + steps, n - i - 1); // Reverse the rest of the array
		}
	}

	private void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

}
