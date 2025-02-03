package com.decimelli.interviewquestion;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }

        for (int i = 2; i < n;) {
            if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) {
                moveToEnd(nums, i, n--);
            } else {
                i++;
            }
        }
        return n;
    }

    private void moveToEnd(int[] nums, int index, int places) {
        for (int i = index; i < places - 1; i++) {
            int tmp = nums[i + 1];
            nums[i + 1] = nums[i];
            nums[i] = tmp;
        }
    }
}