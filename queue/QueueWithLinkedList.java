package com.queue;

public class QueueWithLinkedList {

	ListNode front, rear;

	void enqueue(int data) {

		ListNode newNode = new ListNode(data);
		if (front == null) {
			front = rear = newNode;
		}

		rear.next = newNode;
		rear = newNode;

		System.out.println("printing rear " + rear.val);
	}

	int deque() {
		if (front == null) {
			System.out.println("overflow");
		}
		int res = front.val;

		front = front.next;
		return res;
	}

	public static void main(String[] args) {

		QueueWithLinkedList obj = new QueueWithLinkedList();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);

	int b = obj.deque();
	
	int c= obj.deque();
	int d= obj.deque();

		 System.out.println("deque : "+ b);
		 System.out.println("deque : "+ c);
		 System.out.println("deque : "+ d);

	}

}
