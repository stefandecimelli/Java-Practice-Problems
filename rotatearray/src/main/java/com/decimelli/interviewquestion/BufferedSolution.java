package com.decimelli.interviewquestion;

/**
 * Leetcode submission: 2ms (beats 51.36%), 57.16MB (beats 84.80%)
 */
public class BufferedSolution implements Solution {

	@Override
	public void rotate(int[] nums, int k) {
        int steps = k % nums.length;
		int[] buffer = new int[steps];
        for (int i = 0; i < steps; i++) {
            buffer[i] = nums[nums.length - steps + i];
        }
        for (int i = nums.length ; i > steps; i--) {
            nums[i - 1] = nums[i - steps - 1];
        }
        for (int i = 0; i < buffer.length; i++) {
            nums[i] = buffer[i];
        }
	}

}
