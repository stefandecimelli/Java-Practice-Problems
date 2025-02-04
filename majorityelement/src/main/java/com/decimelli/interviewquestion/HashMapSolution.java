package com.decimelli.interviewquestion;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode submission: 23ms (beats 8.00%), 48.79MB (beats 99.39%)
 */
public class HashMapSolution implements Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int majorityElement = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int newVal = 1 + count.getOrDefault(nums[i], 0);

            if (newVal > count.getOrDefault(majorityElement, 0)) {
                majorityElement = nums[i];
                if (newVal >= nums.length) {
                    return majorityElement;
                }
            }
            count.put(nums[i], newVal);
        }

        return majorityElement;
    }

}