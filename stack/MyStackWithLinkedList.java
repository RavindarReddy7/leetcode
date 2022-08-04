package com.stack;

public class MyStackWithLinkedList {
	ListNode head;
	int size;

	public MyStackWithLinkedList() {
		head = null;
		size = 0;
	}

	public void push(int data) {

		ListNode temp = new ListNode(data);
		temp.next = head;
		size++;
		head = temp;
	}

	public int pop() {

		if (head == null) {
			System.out.println("underflow");
		}
		int res = head.val;
		head = head.next;
		size--;
		return res;
	}

	public int peek() {
		if (head == null) {
			System.out.println("undeflow");
		}
		return head.val;
	}

	public static void main(String[] args) {

		MyStackWithLinkedList myStackWithLinkedList = new MyStackWithLinkedList();
		myStackWithLinkedList.push(10);
		myStackWithLinkedList.push(20);
		myStackWithLinkedList.push(30);
		myStackWithLinkedList.push(40);
		myStackWithLinkedList.push(50);
		
		System.out.println(myStackWithLinkedList.pop()+"  pop value");
		System.out.println(myStackWithLinkedList.size+" size");
		
		System.out.println(myStackWithLinkedList.peek()+" peek value");
		
		
	}

}
