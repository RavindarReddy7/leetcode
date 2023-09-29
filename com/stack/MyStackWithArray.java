package com.stack;

import java.util.Stack;

public class MyStackWithArray {

	int a[];
	int top;
	int capacity;

	public MyStackWithArray(int capacity) {
		this.capacity = capacity;
		top = -1;
		a = new int[capacity];
	}

	public void push(int data) {
		if (top == capacity - 1) {
			System.out.println("overflow");
		}
		top++;
		a[top] = data;

	}

	public int pop() {
		if (top == -1) {
			System.out.println("underflow");
		}
		int res = a[top];
		top--;
		return res;
	}

	public int peek() {

		if (top == -1) {
			System.out.println("underflow");
		}
		return top;

	}

	boolean isEmpty() {
		return top == -1;
	} 
	
	void print() {
		for(int i=top;i>-1;i--) {
			
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {

		MyStackWithArray m1 = new MyStackWithArray(5);
		m1.push(10);
		m1.push(20);
		m1.push(30);
		m1.push(40);
		m1.push(50);
		
		System.out.println("popped "+m1.pop());
		
		m1.print();
		System.out.println(m1.peek());

	}
}
