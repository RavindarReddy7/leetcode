package com.blind75;

import java.util.Arrays;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {

		int[] nums = {10,9,2,5,3,7,101,18};
		
		
		
		System.out.println(longseq(nums));
	}
 	
	public static int longseq(int[] nums) {
		
		
		int n = nums.length;
		int[] dp= new int[n];
		Arrays.fill(dp, 1);
		int res =1;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				
				if(nums[i]>nums[j]) {
					
					//System.out.println("dp[j]+1-->"+dp[j]);
					
					dp[i]= Math.max(dp[i], dp[j]+1);
					
				//	System.out.println("dp[i]-->"+ dp[i]);
				}
			}
			res = Math.max(res, dp[i]);
			//System.out.println("max-->"+ res);
		}
		return res;
	}

}
