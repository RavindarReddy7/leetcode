package com.blind75;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);

		TreeNode head = n1;

		head.left = n2;

		head.right = n3;

		n3.left = n4;

		n3.right = n5;

		List<List<Integer>> list = levelOrder(head);

		System.out.println(list);
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		Queue <TreeNode> q = new LinkedList <TreeNode>();
	      List<List<Integer>> list = new LinkedList <List<Integer>>();
	      if(root == null)
	        return list;
	      
	      q.offer(root);
	      while(!q.isEmpty()) {
	        int num = q.size();
	        List<Integer> subList = new LinkedList<Integer>();
	        for(int i = 0; i < num; i ++) {
	          if(q.peek().left != null)
	            q.offer(q.peek().left);
	           if(q.peek().right != null)
	            q.offer(q.peek().right);
	          subList.add(q.poll().val);
	        }
	        list.add(subList);
	      }
	      return list;
	    }
	}