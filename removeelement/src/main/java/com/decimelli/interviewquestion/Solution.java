package com.decimelli.interviewquestion;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            if (nums[i] == val) {
                for (int k = i + 1; k < n; k++) {
                    swap(nums, k - 1, k);
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
