package com.blind75;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] nums = { 2,3,-2,4 };
		int max = maxSubArray(nums);

		System.out.println(max);

	}

	private static int maxSubArray(int[] nums) {

		int finalproduct = nums[0];
		int minproduct = nums[0];
		int result = finalproduct;

		for (int i = 1; i < nums.length; i++) {

			int tempmax = Math.max(nums[i], Math.max(finalproduct * nums[i], minproduct * nums[i]));

			System.out.println("tempmax--> " + tempmax);
			minproduct = Math.min(nums[i], Math.min(finalproduct * nums[i], minproduct * nums[i]));

			System.out.println("minproduct--> "+ minproduct);
			finalproduct = tempmax;

			System.out.println("finalproduct--> "+ finalproduct);
			result = Math.max(finalproduct, result);
			
			System.out.println( "result-->"+ result);

		}
		return result;
	}
}
