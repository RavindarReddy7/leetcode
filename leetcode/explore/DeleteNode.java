package com.leetcode.explore;
public class DeleteNode {

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummy = new ListNode(-1);
		System.out.println("head "+ head);
		dummy.next = head;
		ListNode first = dummy;
		
		System.out.println(first+" first");
		ListNode second = dummy;
		
		System.out.println( second+ "second");

		while (n-- >= 0) {
			first = first.next;
			System.out.println("first while loop " + first);
		}

		while (first != null) {
			first = first.next;
			System.out.println("second loop " + first);
			second = second.next;
			System.out.println("third loop " + second);
		}
		System.out.println(dummy.next);
		second.next = second.next.next;
		return dummy.next;
	}

	public static void main(String[] args) {

		ListNode list = new ListNode(21, new ListNode(5, new ListNode(19, new ListNode(45, new ListNode(23, null)))));

		ListNode ln = removeNthFromEnd(list, 3);

		System.out.println(ln.toString());
	}

}
