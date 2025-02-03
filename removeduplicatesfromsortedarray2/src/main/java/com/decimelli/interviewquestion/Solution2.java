package com.decimelli.interviewquestion;

public class Solution2 {

	public int removeDuplicates(int[] nums) {
		int n = nums.length;
		if (n == 2) {
			return 2;
		} else if (n == 1) {
			return 1;
		}

		for (int i = 2; i < n;) {
			if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) {
				overwrite(nums, i, n--);
			} else {
				i++;
			}
		}
		return n;
	}

	private void overwrite(int[] nums, int i, int len) {
		for (; i < len - 1; i++) {
			nums[i] = nums[i+1];
		}
	}
}

/*
 * 
 * 
 * 1, 1, 1, 2, 2, 3
 * 
 * 
 */