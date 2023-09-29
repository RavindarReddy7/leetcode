package com.leetcode.explore;
import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int res = 0;
		if(digits[digits.length]==0) {
		//for(int i=0;)
		}
		for (int i = 0; i < digits.length; i++) {

			res = res * 10 + digits[i];

			System.out.println(res);
		}
		res = res + 1;

		String str = Integer.toString(res);
		int[] temp = new int[str.length()];
		for (int i = 0; i <= temp.length - 1; i++) {

			temp[i] = str.charAt(i) - '0';
		}
	
		return temp;
	}

	public static void main(String[] args) {

		int[] a = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		int[] x = plusOne(a);

		Arrays.stream(x).forEach(System.out::print);

	}

}
