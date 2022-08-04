package com.blind75;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5 };

		List<List<Integer>> res = combination(nums, 8);

		System.out.println(res);

	}

	public static List<List<Integer>> combination(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList<>();

		if (candidates == null) {
			return null;
		}

		findCombo(candidates, 0, target, new ArrayList<>(), result);

		return result;

	}

	private static void findCombo(int[] candidates, int index, int target, List<Integer> current,
			List<List<Integer>> result) {
		if(target==0) {
			System.out.println("adding current -->"+ current );
			result.add(new ArrayList<>(current));
		}
		
		for(int i=index; i<candidates.length;i++) {
			System.out.println("candidates[i] -->"+candidates[i]);
			
			System.out.println("target--> "+target);
			if(candidates[i]<=target) {
				System.out.println("inside condition candidates[i] -->"+candidates[i]);
				
				current.add(candidates[i]);
				findCombo(candidates, i, target-candidates[i], current, result);
				
				current.remove(new Integer(candidates[i]));
			}
		}

	}
}
