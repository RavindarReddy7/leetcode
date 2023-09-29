package com.leetcode.explore;
import java.util.Scanner;

public class ReverseArray {
	public static void reverse(int[] nums, int start, int end) {

	while (start < end) {

			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
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

		reverse(nums, 0, nums.length - 1);
	}

}
