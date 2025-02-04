package com.decimelli.interviewquestion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	Solution test = new HashMapSolution();
	Solution test2 = new SortedSolution();
	Solution test3 = new CheatingSolution();
	Solution test4 = new BoyerMooreMajorityVotingSolution();

	@Test
	public void testMajorityElement1() {
		int[] example = { 3, 2, 3 };
		int answer = 3;
		int result = test.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void test2MajorityElement1() {
		int[] example = { 3, 2, 3 };
		int answer = 3;
		int result = test2.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void test3MajorityElement1() {
		int[] example = { 3, 2, 3 };
		int answer = 3;
		int result = test3.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void test4MajorityElement1() {
		int[] example = { 3, 2, 3 };
		int answer = 3;
		int result = test4.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void testMajorityElement2() {
		int[] example = { 2, 2, 1, 1, 1, 2, 2 };
		int answer = 2;
		int result = test.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void test2MajorityElement2() {
		int[] example = { 2, 2, 1, 1, 1, 2, 2 };
		int answer = 2;
		int result = test2.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void test3MajorityElement2() {
		int[] example = { 2, 2, 1, 1, 1, 2, 2 };
		int answer = 2;
		int result = test3.majorityElement(example);
		assertEquals(answer, result);
	}

	@Test
	public void test4MajorityElement2() {
		int[] example = { 2, 2, 1, 1, 1, 2, 2 };
		int answer = 2;
		int result = test4.majorityElement(example);
		assertEquals(answer, result);
	}

}
