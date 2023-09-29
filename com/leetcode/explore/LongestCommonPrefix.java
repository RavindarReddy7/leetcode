package com.leetcode.explore;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strings = { "flower", "flow", "fly" };

		System.out.println(lcp(strings));
	}

	private static String lcp(String[] strings) {

		if (strings.length == 0)
			return "";

		String prefix = strings[0];
		
		System.out.println("prefix ->"+prefix);

		for (int i = 1; i < strings.length; i++) {

			while (strings[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				
				System.out.println("prefix ->"+prefix);

				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}
}
