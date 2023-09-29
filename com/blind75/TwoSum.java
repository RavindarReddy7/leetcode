package com.blind75;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = {2,3,4};
		
		System.out.println( Arrays.toString(sum(nums,6)));
	}

	public static int[] sum(int[] nums, int target) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			int req = target-nums[i];
			
			if(map.containsKey(req)) {
				
				int[] res = {map.get(req), i};
				
				return res;
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
