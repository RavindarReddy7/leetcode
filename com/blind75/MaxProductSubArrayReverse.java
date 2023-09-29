package com.blind75;

public class MaxProductSubArrayReverse {

	public static void main(String[] args) {
		int[] nums = { -1, -2,-3,0};
		int max = maxSubArray(nums);

		System.out.println(max);

	}

	private static int maxSubArray(int[] nums) {
		int max= Integer.MIN_VALUE;
		
		int product =1;
		
		for(int num:nums) {
			
			product*=num;
			
			max= Math.max(max, product);
			if(product ==0)
				product =1;
			
			
		}
		
		product =1;
		for(int i=nums.length-1;i>=0;i--) {
			product*=nums[i];
			max = Math.max(max, product);
			if(product ==0)
				product =1;
		}
		
		return max;
	}

}
