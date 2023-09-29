package dynamicProgramming;

import java.util.Arrays;

public class PrintingWalls {

	public static void main(String[] args) {

		int[] cost = { 1, 2, 3, 2 }, time = { 1, 2, 3, 2 };

		System.out.println(paint(cost, time));
	}

	public static int paint(int[] cost, int[] time) {

		int n = cost.length, dp[] = new int[n + 1];

		Arrays.fill(dp, (int) 1e9);
		
		dp[0]=0;

		for (int i = 0; i < n; i++) {

			for (int j = n; j >0; j--) {

				
				System.out.println( "max->"+ dp[Math.max(j - time[i] - 1, 0)] + cost[i]);
			
				
				dp[j] = Math.min(dp[j], dp[Math.max(j - time[i] - 1, 0)] + cost[i]);
				
				System.out.println("dp["+j +"] =>" + dp[j]);

			}
			System.out.println("dp["+i +"] =>" + dp[i]);
		}

		return dp[n];
	}

}
