package com.stack;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {

		int a[] = new int[] { 10, 22, 3, 4, 6, 1, 34, 56 };

		findSmaller(a);

	}

	private static void findSmaller(int[] a) {

		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < a.length; i++) {
			while (!s.isEmpty() && s.peek() >= a[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(s.peek());
			}
			//System.out.println("a[i]"+ a[i]);
			s.push(a[i]);
			//System.out.println("peek value   " + s.peek());
		}
	}
}
