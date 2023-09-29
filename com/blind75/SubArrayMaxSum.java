package com.blind75;

public class SubArrayMaxSum {

	public static void main(String[] args) {

		int[] nums = { -2, 3,-4};
		int max = maxSubArray(nums);

		System.out.println(max);
	}

	public static int maxSubArray(int[] a) {

		{
		    int max_so_far = a[0];
		    int curr_max = a[0];
		  
		    for (int i = 1; i < a.length; i++)
		    {
		           curr_max = Math.max(a[i], curr_max+a[i]);
		           System.out.println("curr_max -->"+ curr_max);
		        max_so_far = Math.max(max_so_far, curr_max);
		        
		        System.out.println("max_so_far -->"+ max_so_far);
		    }
		    return max_so_far;
		}
		}

}
