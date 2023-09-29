package com.blind75;

public class ReOrderList {

	public static void main(String[] args) {

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		reorderList(head);
		
	}

		public static void reorderList(ListNode head) {

			if (head == null)
				return;

			ListNode slow = head;
			ListNode fast = head.next;
			// finding middle
			while (fast != null &&  fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				System.out.println("loop1");
			}

			// reverse second linkedlist
			ListNode prev = null;

			ListNode curr = slow;
			// ListNode temp=slow;

			while (curr != null) {
				ListNode temp = curr.next;
				curr.next = prev;
				
				System.out.println("loop2");
				prev = curr;
				curr = temp;
			}

			ListNode first = head;
			ListNode second = prev;

			while (second.next != null) {
				ListNode temp1 = first.next;
				first.next = second;
				first = temp1;
				System.out.println("loop3");
				ListNode temp2 = second.next;
				second.next = first;
				second = temp2;
			}
		}
	}

