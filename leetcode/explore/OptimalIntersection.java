package com.leetcode.explore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalIntersection {

	    public static int[] intersection(int[] nums1, int[] nums2) {
	        
	        int i=0,j=0,k=0;
	        
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        while(i<nums1.length && j< nums2.length){
	            
	            if(nums1[i]<nums2[j]){
	                i++;
	            }else if(nums1[i]>nums2[j]){
	                j++;
	            }else{
	                nums1[k++]= nums1[i++];
	                    j++;
	            }
	           
	        }
	        return Arrays.copyOfRange(nums1,0,k);  
	}
	public static void main(String[] args) {

		int[] nums = new int[] { 4, 9, 5 };
		int[] nums2 = new int[] { 9, 4, 9, 8, 4 };
		int[] res = intersection(nums, nums2);
	
		System.out.println(Arrays.toString(res));
	}

}
