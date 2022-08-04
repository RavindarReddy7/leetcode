package com.stack;

import java.util.Stack;

public class ParanthesisMatching {

	public static void main(String[] args) {
		String str = "[{}()]]";
		boolean flag = isMatching(str);
		if (flag==false) {
			System.out.println( "not matching");
		}else {
			System.out.println("yes ");
		}
	}

	private static boolean isMatching(String str) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {

			char cur = str.charAt(i);

			if (isOpening(cur)) {
				s.push(cur);
				System.out.println("opening" + cur);
			} else {
				if (s.isEmpty()) {
					return false;
				} else if (!isMatching(s.peek(), cur)) {
					System.out.println("closing"+ s.peek() + cur);
					return false;

				} else {
					s.pop();
				}
			}
		}
		return s.isEmpty();

	}

	private static boolean isMatching(char cur, Character peek) {

		return (cur == '(' && peek == ')') || (cur == '[' && peek == ']' ) || (cur == '{' && peek == '}');
	}

	private static boolean isOpening(char cur) {
		return ((cur == '[') || (cur == '{') || (cur == '('));

	}
}
