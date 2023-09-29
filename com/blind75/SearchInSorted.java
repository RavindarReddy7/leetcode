package com.blind75;

public class SearchInSorted {

	public static void main(String[] args) {

		int[] nums = { 5, 1, 3 };

		int n = search(nums, 3);

		System.out.println(n);
	}

	public static int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				return mid;
			}
			if (nums[low] <= nums[mid]) {
				if (target >= nums[low] && target < nums[mid]) {
					high = mid - 1;

				} else {
					low = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}
		}
		return -1;
	}

}
