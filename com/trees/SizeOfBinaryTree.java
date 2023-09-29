package com.trees;

import java.util.Scanner;

public class SizeOfBinaryTree {

	private static Scanner sc;

	public static void main(String[] args) {

		TreeNode root = buildTree();

		int size = sizeBt(root);

		System.out.println("size is " + size);

	}

	private static int sizeBt(TreeNode root) {

		if (root == null)
			return 0;

		return sizeBt(root.left) + sizeBt(root.right) + 1;
	}

	public static TreeNode buildTree() {

		TreeNode root = null;

		System.out.println("Enter Data");

		sc = new Scanner(System.in);

		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new TreeNode(data);

		System.out.println("Enter left for " + data);

		root.left = buildTree();

		System.out.println("Enter right for " + data);

		root.right = buildTree();

		return root;
	}

}
