package com.blind75;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		
		int[] nums = {1,4,5};
		System.out.println(change(nums,11));
	}

	public static int change(int[] coins, int amount) {

		int[] dp = new int[amount + 1];

		Arrays.fill(dp, amount + 1);
		
		System.out.println(Arrays.toString(dp));
		dp[0]=0;
		for (int i = 0; i <= amount; i++) {

			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					System.out.println("dp["+i+"]-->"+dp[i]);
					
					System.out.println("dp["+ i+" - coins["+j+"]] -->" + dp[i - coins[j]]);
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
					
					System.out.println("after-->"+ dp[i]);
				} else
					break;
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}

}
