package com.leetcode.explore;
import java.util.Arrays;

public class OptimalPlusOne {

	public static void main(String[] args) {
		int[] a = new int[] {9,8,7,6,5,4,3,2,1,9};

		int[] x = plusOne(a);

		//Arrays.stream(x).forEach(System.out::print);
	}
	public static int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] = digits[i] + 1;

                return digits;
                
            } else
                digits[i] = 0;
        }
        
        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = 0;
            System.out.println(arr[i]);
        }
        Arrays.stream(arr).forEach(System.out::print);  
        return arr;
    }

}
