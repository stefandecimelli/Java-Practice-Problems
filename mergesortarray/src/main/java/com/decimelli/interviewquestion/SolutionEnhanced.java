package com.decimelli.interviewquestion;

/**
 * This solves the same problem as Solution but in O(m+n) time.
 * This means we need to iterate through the array without sorting the nums2
 * array each time we swap.
 */
public class SolutionEnhanced {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index1 = m - 1;
		int index2 = n - 1;
		for (int i = m + n - 1; i >= 0; i--) {
			if (index1 < 0 && index2 >= 0) {
				nums1[i] = nums2[index2--];
			} else if (index2 < 0 && index1 >= 0) {
				nums1[i] = nums1[index1--];
			} else if (nums2[index2] >= nums1[index1]) {
				nums1[i] = nums2[index2--];
			} else if (nums2[index2] < nums1[index1]) {
				nums1[i] = nums1[index1--];
			}
		}
	}

}
