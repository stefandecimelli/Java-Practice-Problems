package com.decimelli.interviewquestion;

/**
 * This one is a lot more optimized than the first Solution.
 * Rather than using shifts, we just set the value to the next int available. 
 */
public class Solution2 {

	public int removeDuplicates(int[] nums) {
		int j = 0; // Number of swaps. 
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] != nums[i]) {
				nums[++j] = nums[i];
			}
		}
		return j + 1;
	}
}
