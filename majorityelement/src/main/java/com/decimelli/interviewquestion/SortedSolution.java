package com.decimelli.interviewquestion;

/**
 * Leetcode submission: 2184ms (beats 5%), 53.36MB (beats 29.48%)
 */
public class SortedSolution implements Solution {

	public int majorityElement(int[] nums) {
		// sort(nums); <- this caused a Time Limit Exceeded in leetcode 
		int mid = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && j - i >= mid) {
					return nums[i];
				}
			}
		}
		return nums[0];
	}

	// Worse than Arrays.sort() !!!!!
	@SuppressWarnings("unused")
	private void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}
}
