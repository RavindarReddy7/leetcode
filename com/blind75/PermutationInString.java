package com.blind75;

public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "bb";
		String s2 = "qwabaik";

		System.out.println(checkSubString(s1, s2));
	}

	public static boolean checkSubString(String s1, String s2) {

		if (s1.length() > s2.length()) {
			return false;
		}

		int str1[] = new int[26];
		int str2[] = new int[26];

		for (int i = 0; i < s1.length(); i++) {

			str1[s1.charAt(i) - 'a']++;

		}

		for (int j = 0; j < s2.length(); j++) {

			if (j >= s1.length()) {

				str2[s2.charAt(j - s1.length()) - 'a']--;
			}

			str2[s2.charAt(j) - 'a']++;

			if (isPerm(str1, str2))
				return true;
		}

		return false;
	}

	private static boolean isPerm(int[] str1, int[] str2) {

		for (int i = 0; i < 26; i++) {

			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}
}
