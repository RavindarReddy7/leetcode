package com.linkedlist;

public class LinkedListpalindrome {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	    public boolean isPalindrome(ListNode head) {
	        if(head == null && head.next ==null){
	            return true;
	        }
	        ListNode fast = head;
	        ListNode slow = head;
	        if(fast.next!=null && fast.next.next !=null){
	        slow = slow.next;
	        fast = fast.next.next;
	        }
	    
	    
	    ListNode revHead = reverse (slow.next);
	    
	     
	        while(revHead !=null){
	            if(revHead.val!=head.val)
	            
	            {
	                return false;
	            }else{
	                revHead = revHead.next;
	                head = head.next;
	            }
	            
	        }
	        return true;
	}


	private ListNode reverse(ListNode next) {
		 ListNode cur= next;
	        ListNode prev = null;
	        
	        while(cur != null){
	            
	            ListNode temp = cur.next;
	            cur.next = prev;
	            prev =cur;
	            cur = temp;
	            
	        }
	        return prev;
	    }

}

