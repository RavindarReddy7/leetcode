package com.blind75;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		
		
		String s = "AABABBA";
		
		System.out.println(characterReplacement(s,2));

	}
	
	    public static int characterReplacement(String s, int k) {
	        
	        int maxLen = 0;
	        int start = 0, end = 0;
	        
	        int[] charArr = new int[26];
	        
	        int maxCountOfChar = 0;
	        
	        while(end < s.length()) {
	            char c = s.charAt(end);
	            charArr[c - 'A'] ++;
	            System.out.println(Arrays.toString(charArr));
	            maxCountOfChar = Math.max(maxCountOfChar, charArr[c - 'A']);
	            System.out.println("maxCountOfChar is"+ maxCountOfChar );
	            while(end - start + 1 - maxCountOfChar > k) {
	                charArr[s.charAt(start) - 'A']--;
	                System.out.println("inside -->"+Arrays.toString(charArr));
	                start++;
	            }
	            maxLen = Math.max(maxLen, end - start + 1);
	            System.out.println("maxLen ->"+maxLen);
	            end ++;
	            System.out.println("end_->" + end);
	        }
	        return maxLen;
	    }
}
