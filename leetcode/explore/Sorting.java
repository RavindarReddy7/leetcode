package com.leetcode.explore;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

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
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
