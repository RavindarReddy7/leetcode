package com.blind75;

public class LongestsubStringWithoutRepeatingChar {

	public static void main(String[] args) {

		String s = "abcabcbb";
		
		System.out.println(func(s));
	}

	
	public static int func(String s) {
		
		String res = "";
		
		if(s.length()==0)
			return 0;
		
		if(s.length()==1)
			return 1;
		
		int len = Integer.MIN_VALUE;
		
		for(char c: s.toCharArray()) {
			
			String cs = String.valueOf(c);
			
			if(res.contains(cs)) {
				
				res = res.substring(res.indexOf(cs)+1);
			}
			
			res = res+ String.valueOf(cs);
			
			len = Math.max(res.length(), len);
		}
		
		return len;
		
	}
}
