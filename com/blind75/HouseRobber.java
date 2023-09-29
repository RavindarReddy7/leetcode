package com.blind75;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2,3,1 };
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		int sum1 = 0;
		int sum2 = 0;

		int max = 0;

		for (int i = 0; i < nums.length; i++) {

			max = Math.max(nums[i]+sum1, sum2);

			System.out.println("max--> "+max);
			sum1 = sum2;
			System.out.println("sum1--> "+ sum1);

			sum2 = max;
			
			System.out.println("sum2--> "+ sum2);

		}

		return sum2;
	}

}
