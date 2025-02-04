package com.decimelli.interviewquestion;

import java.util.Arrays;

/**
 * Leetcode submission: 4ms (beats 51.55%), 53.66MB (beats 8.54%)
 */
public class CheatingSolution implements Solution {

	@Override
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

}
