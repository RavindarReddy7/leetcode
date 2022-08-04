package com.stack;

import java.util.Stack;

public class NextGreaterNumber {


	public static void main(String[] args) {

		int a[] = new int[] { 10, 22, 3, 4, 6, 1, 34, 56 };

		findSmaller(a);

	}

	private static void findSmaller(int[] a) {

		Stack<Integer> s = new Stack<Integer>();
		int b[] = new int[a.length];
		for (int i = a.length-1; i >=0  ; i--) {
			while (!s.isEmpty() && s.peek() <= a[i]) {
				
				s.pop();
				
			}
			if (s.isEmpty()) {
				b[i]=-1;
				//System.out.println("-1");
			} else {
				b[i]=s.peek();
				//System.out.println(s.peek());
			}
			
			//System.out.println("b[i]"+ b[i]);
			s.push(a[i]);
			//System.out.println("peek value   " + s.peek());
			
		}
		for(int k=0;k<b.length;k++) {
			System.out.println( b[k]);
		}
	}
}