package com.leetcode.explore;
import java.util.ArrayList;
import java.util.List;

public class LongestSubStringLength {
		
		 public static int longestUniqueSubsttr(String str)
		    {
		        String test = "";
		 
		        List<String> stringlist =new ArrayList<>();
		        // Result
		        int maxLength = Integer.MIN_VALUE;
		 
		        // Return zero if string is empty
		        if (str.isEmpty()) {
		            return 0;
		        }
		        // Return one if string length is one
		        else if (str.length() == 1) {
		            return 1;
		        }
		        for (char c : str.toCharArray()) {
		            String current = String.valueOf(c);
		 
		            // If string already contains the character
		            // Then substring after repeating character
		            if (test.contains(current)) {
		            	stringlist.add(test);
		            	test = test.substring(test.indexOf(current)
		                                      + 1);
		            }
		            test = test + String.valueOf(c);
		            maxLength = Math.max(test.length(), maxLength);
		        }
		    System.out.println( "ind strings "+stringlist.toString());
		        return maxLength;
		    }
		 
		    // Driver code
		    public static void main(String[] args)
		    {
		        String str = "geeksforgeeks";
		        System.out.println("The input string is " + str);
		 
		        int len = longestUniqueSubsttr(str);
		        System.out.println("The length of the longest "
		                           + "non-repeating character "
		                           + "substring is " + len);
		    
		}

	}


