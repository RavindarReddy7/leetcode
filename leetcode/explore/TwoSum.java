package com.leetcode.explore;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] a = new int[] { 2, 7,11,15 };
		int[] x = twoSum(a, 9);
		System.out.println(Arrays.toString(x));

	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int req = target - nums[i];
			System.out.println(req+" req");
			if (map.containsKey(req)) {
				int temp[] = { map.get(req), i };
				return temp;
			}
			map.put(nums[i], i);
			System.out.println(map+ "   map");
		}

		return null;

	}
}
