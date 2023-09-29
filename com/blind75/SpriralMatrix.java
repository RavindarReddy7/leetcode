package com.blind75;

import java.util.ArrayList;
import java.util.List;

public class SpriralMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		/*
		 * for(int i=0;i<matrix.length;i++) { for(int j=0;j<matrix.length;j++) {
		 * 
		 * System.out.println("matrix "+matrix[i][j]);
		 * 
		 * } }
		 */
		
		List<Integer> result = spiralOrder(matrix);

		System.out.println(result);
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList();

		int rowBegin = 0;
		int rowEnd = matrix.length - 1;
		int columnBegin = 0;
		int columnEnd = matrix[0].length - 1;

		while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

			for (int i = columnBegin; i <= columnEnd; i++) {
				list.add(matrix[rowBegin][i]);
			}
			rowBegin++;

			for (int i = rowBegin; i <= rowEnd; i++) {
				list.add(matrix[i][columnEnd]);
			}

			columnEnd--;

			if (rowBegin <= rowEnd) {
				for (int i = columnEnd; i >= columnBegin; i--) {

					list.add(matrix[rowEnd][i]);
				}
			}
			rowEnd--;

			if (columnBegin <= columnEnd) {
				for (int i = rowEnd; i >= rowBegin; i--) {
					list.add(matrix[i][columnBegin]);
				}
			}
			columnBegin++;
		}
		return list;
	}

}
