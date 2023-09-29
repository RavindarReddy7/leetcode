package com.linkedlist;

import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

	public static void main(String[] args) {

		ListNode list1 = createLinkedList(new int[] { 1, 9, 3 });
		ListNode list2 = createLinkedList(new int[] { 4, 8, 6 });
		ListNode list3 = createLinkedList(new int[] { 7, 5, 2 });

		ListNode[] linkedLists = { list1, list2, list3 };

		ListNode node = mergeKLists(linkedLists);
		
		while(node!=null) {
			
			System.out.println(node.val);
			
			node = node.next;
		}
	}

		private static ListNode mergeKLists(ListNode[] linkedLists) {
		
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		
		
		for(ListNode head : linkedLists) {
			
			while(head!=null) {
				
				minheap.add(head.val);
				
				head=head.next;
				
				System.out.println(minheap);
			}
		}
		
		ListNode head = new ListNode(-1);
		
		ListNode dummy = head;
		
		
		while(!minheap.isEmpty()) {
			
			head.next  = new ListNode(minheap.remove());
			
			System.out.println(minheap);
			
			head= head.next;
		}

		return dummy.next;
	}

	public static ListNode createLinkedList(int[] values) {
		if (values == null || values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;

		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}

		return head;
	}
}
