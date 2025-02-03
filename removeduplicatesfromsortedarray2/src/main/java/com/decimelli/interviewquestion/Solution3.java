package com.decimelli.interviewquestion;

public class Solution3 {

	/**
	 * A two-pointer, in-place, greedy algorithm with O(n) time complexity. It is far more preformant than the other 
	 * solutions
	 * 
	 * @param nums a sorted array
	 * @return the number of elements in the in-place array "nums" that the answer is contained in
	 */
	public int removeDuplicates(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (j < 2 || nums[i] > nums[j - 2]) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}
}
