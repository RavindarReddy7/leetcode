package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

class LIS {

	public static void main(String[] args) {

		int[] nums = { 0,1,0,3,2,3};

		System.out.println(lengthOfLIS(nums));

	}

	public static int lengthOfLIS(int[] nums) {

		List<Integer> list = new ArrayList<>();
		list.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > list.get(list.size() - 1)) {
				list.add(nums[i]);
			} else {

				int low = 0;
				int high = list.size() - 1;
				while (low <= high) {

					int mid = (low + high) / 2;

					if (list.get(mid) < nums[i]) {
						low = mid + 1;
					} else {
						high = mid - 1;
						System.out.println("high" + high);
					}
				}

				list.set(low, nums[i]);
				
				System.out.println(list.toString());
			}
		}
		return list.size();
	}
}
