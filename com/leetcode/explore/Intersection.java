package com.leetcode.explore;
import java.util.ArrayList;
import java.util.List;

public class Intersection {

	private static int[] intersection(int[] nums1, int[] nums2) {
	
		List<Integer> list = new ArrayList<Integer>();
		int i=0,j=0;
		while(i<nums1.length && j< nums2.length)

				if(nums1[i]<nums2[j]) {
					i++;
				}else if(nums1[i]>nums2[j]) {
					j++;
				}else {
					list.add(nums1[i]);
				      j++;
				      i++;
				}
		
		int[] temp = new int[list.size()];
		for(int k=0; k< list.size();k++) {
			temp[k]= list.get(k);
		}
		
		return temp;
	}

	public static void main(String[] args) {

		/*
		 * System.out.println("enter no. of elements in 1st array"); Scanner sc1 = new
		 * Scanner(System.in); int size = sc1.nextInt();
		 * 
		 * System.out.println("enter numbers for 1st array");
		 * 
		 * Scanner sc = new Scanner(System.in); int[] nums = new int[size];
		 * 
		 * for (int i = 0; i < nums.length; i++) { nums[i] = sc.nextInt(); }
		 * 
		 * System.out.println("enter no. of elements in 2nd array"); Scanner sc2 = new
		 * Scanner(System.in); int size2 = sc2.nextInt();
		 * 
		 * System.out.println("enter numbers for 2nd array");
		 * 
		 * Scanner sc3 = new Scanner(System.in); int[] nums2 = new int[size2];
		 * 
		 * for (int i = 0; i < nums2.length; i++) { nums2[i] = sc3.nextInt(); }
		 */
		
		int[] nums = new int[] {4,9,5};
		int[] nums2 = new int[] {9,4,9,8,4};
        int[] res = intersection(nums,nums2);
        System.out.println(res.toString());
	}

}
