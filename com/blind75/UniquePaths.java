package com.blind75;

public class UniquePaths {

	public static void main(String[] args) {

		System.out.println(uniquepaths(3,7));
	}

	public static int uniquepaths(int m, int n) {

		int[][] count = new int[m][n];

		for (int i = 0; i < m; i++) {
			count[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			count[0][i] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				count[i][j] = count[i - 1][j] + count[i][j - 1];
				
				System.out.println( count[i][j]);
			}
		}
		return count[m - 1][n - 1];
	}
}
