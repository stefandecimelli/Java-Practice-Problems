package com.decimelli.interviewquestion;


/**
 * LeetCode results: 2ms (beats 75%), 61.76MB (beads 50%)
 */
public class KadaneSolution implements Solution {

	@Override
	public int maxProfit(int[] prices) {
		int buy = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < buy) {
				buy = prices[i];
			} else if (prices[i] - buy > profit) {
				profit = prices[i] - buy;
			}
		}
		return profit;
	}

}
