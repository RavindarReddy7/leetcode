package com.leetcode.explore;
import java.util.Scanner;

public class RotateArray {
	public static void rotate(int[] nums, int k) {

		int len = nums.length-1;

		int[] temp = new int[nums.length-1];

		for (int i = 0; i < k; i++) {
			temp[i] = nums[len - k + i + 1];
			
			System.out.println("first loop witk K"+temp[i]);
		}
		for (int i = 0; i < k+1; i++) {

			System.out.println("initial array"+ nums[i]);
			temp[k] = nums[i-1];
			System.out.println("second loop"+temp[i]);
		}

		for (int j = 0; j < temp.length; j++) {

			System.out.println("temp j"+ temp[j]);
			nums[j] = temp[j];
		}

		for (int m = 0; m < nums.length; m++) {
			System.out.println("final loop"+nums[m]);
		}
	}

	public static void main(String[] args) {
		/*
		 * System.out.println("enter no. of elements"); Scanner sc1 = new
		 * Scanner(System.in); int size = sc1.nextInt();
		 * 
		 * System.out.println("enter numbers");
		 * 
		 * Scanner sc = new Scanner(System.in); int[] nums = new int[size]; for(int
		 * i=0;i<nums.length;i++) { nums[i]= sc.nextInt(); }
		 * 
		 * System.out.println("enter size to rotate"); Scanner sc2 = new
		 * Scanner(System.in); int size2 = sc1.nextInt();
		 */
		
		int nums[]= {0,1,2,3,4,5};
		int size=3;
		rotate(nums,size);
	}

}
