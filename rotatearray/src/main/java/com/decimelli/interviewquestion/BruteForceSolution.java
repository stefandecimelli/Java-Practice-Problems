package com.decimelli.interviewquestion;

/**
 * Time Limit Exceeded in LeetCode
 */
public class BruteForceSolution implements Solution {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateOnce(nums);
        }
    }

    private void rotateOnce(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
}