package dynamicProgramming;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 6, 8 };

		boolean[] dp = new boolean[100];
		System.out.println(canSum(arr, 61, dp));
	}

	public static boolean canSum(int[] arr, int targetSum, boolean[] dp) {

		if (Arrays.asList(dp).contains(targetSum)) {
			return dp[targetSum];
		}
		if (targetSum == 0)
			return true;

		if (targetSum < 0) {
			return false;
		}

		for (int num : arr) {

			int remainder = targetSum - num;
			System.out.println("remainder" + remainder);
			if (canSum(arr, targetSum - num, dp)) {
				dp[targetSum] = true;
				return true;
			}
		}

		dp[targetSum] = false;
		return false;
	}
}
