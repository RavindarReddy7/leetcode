package com.leetcode.explore;

public class OptimalPalindrome {

	public static void main(String[] args) {


		String s = "!,Pp,!";

		boolean flag = isPalindrome(s);

		System.out.println(flag);
	}
	public static boolean isPalindrome(String s) {
	    int l = 0;
	    int r = s.length() - 1;

	    while (l < r) {
	      while (l < r && !Character.    isLetterOrDigit(s.charAt(l)))
	        ++l;
	      while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
	        --r;
	      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
	        return false;
	      ++l;
	      --r;
	    }

	    return true;
	  }
	

}
