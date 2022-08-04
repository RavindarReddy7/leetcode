package com.leetcode.explore;
import java.util.Scanner;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
        int res = nums[0] ;
        for  (int i=1;i< nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
        
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
		int num = singleNumber(nums);
		
		System.out.println( num);
	}
}
