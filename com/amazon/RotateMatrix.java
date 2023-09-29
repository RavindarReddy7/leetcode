package com.amazon;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotate(matrix);

	}

	public static void rotate(int[][] matrix) {
		int n = matrix.length - 1;
		int[][] m1 = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				m1[i][j] = matrix[n - j][i];

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println(m1[i][j]);
			}
		}
	}
}