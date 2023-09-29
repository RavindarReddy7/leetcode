package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {

		int[] candidates = { 1,2,5 };

		List<List<Integer>> res = combination(candidates, 5);

		System.out.println(res);

	}

	private static List<List<Integer>> combination(int[] candidates, int target) {
		//Arrays.sort(candidates);

		List<List<Integer>> result = new ArrayList<>();

		backTrack(0, candidates, target, new ArrayList<>(), result);

		return result;

	}

	public static void backTrack(int index, int[] candidates, int target, List<Integer> curr,
			List<List<Integer>> result) {

		if (target == 0) {

			result.add(new ArrayList<>(curr));

			return;
		}

		for (int i = index; i < candidates.length; i++) {

			/*
			 * if (i != index && candidates[i] == candidates[i - 1]) {
			 * 
			 * continue; }
			 */
			if (candidates[i] > target)
				break;

			curr.add(candidates[i]);

			backTrack(i , candidates, target - candidates[i], curr, result);

			curr.remove(curr.size() - 1);
		}
	}
}