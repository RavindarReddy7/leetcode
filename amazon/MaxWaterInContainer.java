package com.amazon;

public class MaxWaterInContainer {

	public static void main(String[] args) {

		 int a[] = {1,8,6,2,5,4,8,3,7};
	     int b[] = {3, 1, 2, 4, 5};
	     
	     int area = maxArea(a);
	     System.out.println("first area  "+area);
	     //int area2 = maxArea(b);
	     
	     //System.out.println("second area "+area2);
	     
	}
	    public static int maxArea(int[] height) {
	        int left =0;
	        int right =height.length-1;
	        int area=0;
	        while(left<right){
	        	
	        	System.out.println("left "+height[left]);
	        	System.out.println("right "+ height[right]);
	        	System.out.println("(rigth -left) "+ (right-left));
	        	
	        	System.out.println("min value "+Math.min(height[left],height[right]));
	        	
	        	System.out.println("sample area "+ Math.min(height[left],height[right])*(right-left));
	        	
	            area = Math.max(area,Math.min(height[left],height[right])*(right-left));
	            System.out.println(" print area everytime  "+ area);
	            if(height[left] < height[right]){
	                left++;
	            }else{
	                right--;
	            }
	        }
	         return area;
	    }
	   
}
