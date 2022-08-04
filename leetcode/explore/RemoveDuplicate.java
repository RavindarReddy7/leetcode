package com.leetcode.explore;
import java.util.Scanner;

public class RemoveDuplicate {

	public static int removeDuplicates(int[] nums) {
		int k = 1;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[k] = nums[i+1];
				k++;
			}
		}
		for(int m=0;m<nums.length-1;m++) {
			System.out.println(nums[m]);
		}
		return k;
	}

	public static void main(String[] args) {
		
		System.out.println( "enter no. of elements");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		
		System.out.println("enter numbers");
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[size];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]= sc.nextInt();
		}
		
		int k = removeDuplicates(nums);

	}

}
