package com.blind75;

public class WordSearchOne {

	public static void main(String[] args) {

	}

	public boolean exist(char[][] board, String word) {

		int m = board.length;
		int n = board[0].length;
		boolean visited[][] = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == word.charAt(0) && search(i, j, board, word, 0, visited)) {
					return true;
				}
			}
		}
		return false;

	}

	public boolean search(int i, int j, char[][] board, String word, int index, boolean[][] visited) {

		if (index == word.length()) {
			return true;
		}

		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)
				|| visited[i][j]) {
			return false;

		}

		visited[i][j] = true;

		boolean found = search(i + 1, j, board, word, index + 1, visited)
				|| search(i - 1, j, board, word, index + 1, visited)
				|| search(i, j + 1, board, word, index + 1, visited)
				|| search(i, j - 1, board, word, index + 1, visited);

		if (!found) {
			visited[i][j] = false;
		}

		return false;

	}
}