package com.linkedlist;
public class ListNode {
	int val;
	public ListNode next;

	ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public String toString() {
	    String result = val + " ";
	    if (next != null) {
	        result += next.toString();
	    }
	    return result;
	}
}