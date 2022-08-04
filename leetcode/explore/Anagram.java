package com.leetcode.explore;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "b";

		boolean flag = isAnagram(s1, s2);
		System.out.println(flag);

	}

	private static boolean isAnagram(String s1, String s2) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			System.out.println("map1.getOrDefault(c2, 0)"+ map1.getOrDefault(c, 0) );
			map1.put(c, map1.getOrDefault(c, 0)+1);

		}

		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (int i = 0; i < s2.length(); i++) {
			char c2 = s2.charAt(i);
			System.out.println("map2.getOrDefault(c2, 0)"+ map2.getOrDefault(c2, 0) );
			map2.put(c2, map2.getOrDefault(c2, 0)+1);

		}
		System.out.println(map1);
		System.out.println(map2);
		if (map1.equals(map2)) {
			return true;
		} else
			return false;
	}

}
