package com.decimelli.interviewquestion;

/**
 * The Boyer-Moore Majority Voting Algorithm is a method for finding the
 * majority element in a sequence of elements.
 * It's named after Robert S. Boyer and J Strother Moore, who published it in
 * 1981. It's efficient, using linear time
 * and constant space.
 * 
 * Leetcode submission: 1ms (beats 99.80%), 53.10MB (beats 58.97%)
 */
public class BoyerMooreMajorityVotingSolution implements Solution {

	@Override
	public int majorityElement(int[] nums) {
		int counter = 0;
		int candidate = 0;

		for (int num : nums) {
			if (counter == 0) {
				candidate = num;
			}
			if (num == candidate) {
				counter++;
			} else {
				counter--;
			}
		}
		return candidate;
	}

}
