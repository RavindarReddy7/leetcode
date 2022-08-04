package com.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 1, 2, 2, 3, 4, 4 };

		System.out.println(Arrays.toString(frequent(nums, 3)));
	}

	public static int[] frequent(int[] nums, int k) {

		if (k == nums.length) {
			return nums;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer>[] bucketlist = new List[nums.length + 1];

		for (int i = 0; i < bucketlist.length; i++) {
			bucketlist[i] = new ArrayList<>();
		}

		for (int key : map.keySet()) {

			bucketlist[map.get(key)].add(key);
		}

		List<Integer> flattened = new ArrayList<>();

		for (int i = bucketlist.length - 1; i >= 0; i--) {
			for (int num : bucketlist[i]) {

				flattened.add(num);

			}
		}

		int[] top = new int[k];

		for (int i = 0; i < k; i++) {

			top[i] = flattened.get(i);
		}
		return top;

	}

}
