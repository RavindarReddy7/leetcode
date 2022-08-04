package com.leetcode.explore;
import java.util.HashSet;
import java.util.Set;

public class FirstuniqChar {

	public static void main(String[] args) {
		String s = "leet";

		int x = firstUniqChar(s);
		System.out.println(x);

	}

	//private static int firstUniqChar(String s) {
		/*HashMap<Character, Integer> count = new HashMap<>();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			System.out.println(c+" ");
			count.put(c, count.getOrDefault(c, 0) + 1);
			System.out.println(count);
			//count.get(i);
		}

		for (int i = 0; i < n; i++) {
			//System.out.println( count.get(s.charAt(i)));
			if (count.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}*/
		public static int firstUniqChar(String s) {
	        Set<Character> set = new HashSet<>();
	        for(int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            boolean flag = set.contains(ch);
	        System.out.println(flag); 
	        System.out.println(s.lastIndexOf(ch));
	            if(!flag && s.lastIndexOf(ch) == i) {
	                return i;
	            }
	            
	            if(!flag) {
	                set.add(s.charAt(i));
				}
	        }
	        
	        return -1;
	    }

}
