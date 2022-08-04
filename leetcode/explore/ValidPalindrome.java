package com.leetcode.explore;
import java.util.stream.Stream.Builder;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";

		boolean flag = isPalindrome(s);

		System.out.println(flag);
	}

	private static boolean isPalindrome(String s) {
/*		boolean flag = false;
		String str = s.toLowerCase();
		String newString = "";

		for (int i = 0; i < s.length(); i++) {

			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||( str.charAt(i)>=0 || str.charAt(i)<=9)) {
				newString = newString + str.charAt(i);
			}
		}
		
		System.out.println(newString);
		newString = newString.replaceAll(
		          "[^a-zA-Z0-9]", "");
		System.out.println(newString);
		
		if(newString.length()==1 || newString==""){
            flag = true;
        }
		int count =0;
		int start = 0;
		int end = newString.length()-1;
		System.out.println(end +" end index");

		while (start <  end) {
			if (newString.charAt(start++) == newString.charAt(end--)) {
				System.out.println(newString.charAt(start) + " start");
				System.out.println(newString.charAt(end) + " end");
				
				flag = true;
			} else {
				count++;
			flag = false;
			}
			 
		}
		if(count>0) {
			return false;
		}else
		return flag;
	}*/

	
		StringBuilder builder = new StringBuilder();
	
		s.chars().filter(c->Character.isLetterOrDigit(c)).mapToObj(c->Character.toLowerCase((char)c))
		.forEach(builder::append);
		
		System.out.println(builder.toString());
		
		System.out.println( builder.reverse().toString());

      return builder.toString().equals(builder.reverse().toString());

}
	}
