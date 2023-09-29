package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumI {

	public static void main(String[] args) {
		int[] nums = {3,4,5 };

		List<List<Integer>> res = combination(nums, 8);

		System.out.println(res);

	}

	public static List<List<Integer>> combination(int[] nums, int target) {

		List<List<Integer>> res = new ArrayList<>();

		if (nums.length == 0)
			return null;

		dfs(nums, 0, target, res, new ArrayList<>());

		return res;

	}

	private static void dfs(int[] nums, int index, int target, List<List<Integer>> res, List<Integer> list) {

		if (target == 0) {

			res.add(new ArrayList<>(list));

			return;
		}else if(target<0){
			return;
		}

		for (int i = index; i < nums.length; i++) {

				list.add(nums[i]);

				dfs(nums, i, target - nums[i], res, list);

				list.remove(list.size() - 1);
		}
	}

}
