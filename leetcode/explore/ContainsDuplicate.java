package com.leetcode.explore;
import java.util.Scanner;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				return false;
			}
		}
		return true;
		

	}

	public static void main(String[] args) {
		System.out.println("enter no. of elements");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();

		System.out.println("enter numbers");

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		containsDuplicate(nums);
	}

}
