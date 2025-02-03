package com.decimelli.interviewquestion;

public class Solution {

    /**
     * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, and
     * two integers m and n, representing the number of elements in nums1 and nums2
     * respectively. This function merges nums1 and nums2 into a single array
     * sorted in non-decreasing order. The final sorted array is not returned by the
     * function, but instead is stored inside the array nums1. To accommodate this,
     * nums1 should have a length of m + n, where the first m elements denote the
     * elements
     * that should be merged, and the last n elements are set to 0 and should be
     * ignored. nums2 has a length of n.
     * 
     * @param nums1 The first sorted array
     * @param m     The length of the first sorted array
     * @param nums2 The second sorted array
     * @param n     The length of the second sorted array
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0, j = 0; i < m + n; i++) {
            if (nums1[i] == 0 && i >= m) {
                nums1[i] = nums2[j++];
            }
            else if (nums1[i] > nums2[0]) {
                swap(nums1, i, nums2, 0);
                sort(nums2, n);
            }
        }
    }

    private void sort(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, nums, j);
                }
            }
        }
    }

    private void swap(int[] nums1, int index1, int[] nums2, int index2) {
        int tmp = nums1[index1];
        nums1[index1] = nums2[index2];
        nums2[index2] = tmp;
    }
}