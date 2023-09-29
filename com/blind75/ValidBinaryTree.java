package com.blind75;

public class ValidBinaryTree {

	public static void main(String[] args) {

		
		
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(3);
		TreeNode head = n1;

		head.left = n2;

		head.right = n3;

		
		isValidBST(n1);
	}

	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	public static  boolean isValidBST(TreeNode root) {
		return isBst(root, Long.MIN_VALUE, Long.MAX_VALUE);

	}

	public static boolean isBst(TreeNode root, Long min, Long max) {

		if (root == null) {
			return true;
		}

		if (root.val <= min || root.val >= max) {

			return false;
		}

		System.out.println(Long.valueOf(root.val) );
		
		return isBst(root.left, min, Long.valueOf(root.val)) && isBst(root.right, Long.valueOf(root.val), max);

	}
}
