package com.amazon;

import java.util.Arrays;

public class ProductOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };

		int[] sum = product(nums);

		System.out.println(Arrays.toString(sum));

	}

	private static int[] product(int[] nums) {

		int[] product = new int[nums.length];
		int n = nums.length;
		product[n - 1] = 1;

		for (int i = n - 1; i > 0; i--) {

			product[i - 1] = product[i] * nums[i];

		}

		int left = 1;
		for (int i = 0; i < n; i++) {

			product[i] = left * product[i];
			left = left * nums[i];

		}
		return product;
	}

}
