package com.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InvertTree {

	private static Scanner sc;

	public static void main(String[] args) {

		TreeNode root = buildTree();

		System.out.println("Original Tree:");

		printTree(root);

		TreeNode invert = invertTree(root);

		System.out.println("Inverted" + "\n");

		printTree(invert);
	}

	private static TreeNode invertTree(TreeNode root) {

		if (root == null) {

			return null;
		}

		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			TreeNode node = q.poll();
			System.out.println(node.val);
			
			TreeNode temp = root.left;
			
			root.left = root.right;
			root.right=temp;
			
			if(node.left!=null) {
				q.add(node.left);
			}
			if(node.right!=null) {
				q.add(node.right);
			}
		}
		return root;
	}

	public static TreeNode buildTree() {

		TreeNode root = null;

		System.out.println("Enter Data");

		sc = new Scanner(System.in);

		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new TreeNode(data);

		System.out.println("Enter left for "+ data );

		root.left = buildTree();

		System.out.println("Enter right for "+ data);

		root.right = buildTree();

		return root;
	}

	public static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			TreeNode node = queue.poll();
			
			System.out.println(node.val);
			
			if(node.left!=null) {
				queue.add(node.left);
			}
			
			if(node.right!=null) {
				queue.add(node.right);
			}
		}
		
	}

}
