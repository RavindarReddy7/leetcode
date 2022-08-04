package com.blind75;

public class MaxPathSumBinaryTree {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(-10);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		TreeNode head = n1;

		head.left = n2;

		head.right = n3;

		n3.left = n4;
		
		n3.right = n5;
		
		int val = maxPathSum(n1);

		System.out.println(val);

	}

	static int maxsum = Integer.MIN_VALUE;

	public static int maxPathSum(TreeNode root) {

		maxgain(root);
		return maxsum;
	}

	public static int maxgain(TreeNode node) {
		if (node == null)
			return 0;

		int max = 0;

		int leftmax = Math.max(maxgain(node.left), 0);

		int rightmax = Math.max(maxgain(node.right), 0);

		int price = node.val + leftmax + rightmax;

		System.out.println( "price--> "+ price);
		maxsum = Math.max(maxsum, price);
		System.out.println( "maxsum--> "+ maxsum);

		System.out.println("leftmax--"+leftmax);
		
		System.out.println("rightmax-->"+ rightmax);
		System.out.println("node.val-->"+ node.val);
		return node.val + Math.max(leftmax, rightmax);

	}

}
