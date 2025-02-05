package com.decimelli.interviewquestion;

/*
 * Time limit exceeded, O(n log n) is too slow for this algorithm to work on large data sets.
 */
public class BruteTwoIndexSolution implements Solution {

    public int maxProfit(int[] prices) {
        int maxDistance = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int distance = prices[j] - prices[i];
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }
}