package com.leetcode.explore;

public class MergeLinkedList {
	
public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        while (list1!=null && list2!=null){
            
            if(list1.val < list2.val){
                System.out.println( list1.val+"first list");
                head.next = list1;
                list1= list1.next;
            }
            else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        
        if(list1!=null){
            head.next=list1;
            list1 = list1.next;
        }
        else {
            head.next=list2;
            list2=list2.next;
        }
        System.out.println( dummy.next);
       return dummy.next; 
    }

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(2);
		ListNode head = n1;
		n1.next = n2;
		n2.next= n3;
		n3.next =n4;
		n4.next = null;
		
		ListNode n5 = new ListNode(1);
		ListNode n6 = new ListNode(2);
		ListNode n7 = new ListNode(4);
		ListNode n8 = new ListNode(2);
		ListNode head1 = n5;
		n5.next = n2;
		n6.next= n3;
		n7.next =n4;
		n8.next = null;
	
	mergeTwoLists(head,head1);

}
}
