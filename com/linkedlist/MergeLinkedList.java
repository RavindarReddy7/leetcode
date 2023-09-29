package com.linkedlist;

public class MergeLinkedList {
	
public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        System.out.println(head+ " head");
        while (list1!=null && list2!=null){
            
        	//System.out.println("list1.val--> "+list1.val);
        	//System.out.println("list2.val--> "+list2.val);
            if(list1.val < list2.val){
               //System.out.println( list1+"first list");
                head.next = list1;
               // System.out.println("head.next -->"+ head.next);
                //System.out.println("list1.next--> "+list1.next);
                list1= list1.next;
                
                System.out.println( "list1 --> "+ list1);
                
                System.out.println("head after each step--> "+head);
            }
            else{
            	//System.out.println( list2+"second list2");
                head.next = list2;
                //System.out.println("head.next -->"+ head.next);
                //System.out.println("list2.next--> "+list2.next);
                list2= list2.next;
                
                System.out.println( "list2 --> "+ list2);
            	
                System.out.println("head after each step--> "+head);
            }
            
            //System.out.println("head.next in while loop -->"+ head.next);
            head = head.next;
            System.out.println( "head in while loop --> "+ head);
            System.out.println("dummy "+dummy);
        }
        
        if(list1!=null){
        	head.next=list1;
            //list1 = list1.next;
        }
        else {
        	head.next=list2;
            //list2=list2.next;
        }
        System.out.println( dummy.next);
       return dummy.next; 
    }

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(4);
		//ListNode n4 = new ListNode(4);
		ListNode head = n1;
		n1.next = n2;
		n2.next= n3;
		n3.next =null;
		//n4.next = null;
		
		ListNode n5 = new ListNode(1);
		ListNode n6 = new ListNode(3);
		ListNode n7 = new ListNode(4);
		//ListNode n8 = new ListNode(4);
		ListNode head1 = n5;
		n5.next = n6;
		n6.next= n7;
		n7.next =null;
		//n8.next = null;
	
		ListNode node = mergeTwoLists(head,head1);
		
		 {
		        while (node != null) {
		            System.out.printf(" ", node.val);
		            node = node.next;
		        }
		    }

}
}
