package com.blind75;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MeetingRoomsII {

	public static void main(String[] args) {

		int[][] nums = {{0,30},{5,10},{15,20}};
		
		System.out.println(minMeetingRooms(nums));
	}

	public static int minMeetingRooms(int[][] intervals) {

		
		if(intervals.length==0 || intervals==null)
		{
			return 0;
			
		}
		

		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		minheap.add(intervals[0][1]);
		
		for(int i=1;i<intervals.length;i++) {
			
			
			//System.out.println("intervals[i][0]"+intervals[i][0]+" ");
			
			//System.out.println("peek"+ minheap.peek()+" ");
			
			if(intervals[i][0]>= minheap.peek()) {
				
				//System.out.println( "poll"+ minheap.poll());
				
				minheap.poll();
				
			}
			
			//System.out.println("add"+ intervals[i][0] );
			minheap.add(intervals[i][1]);
		}

		System.out.println( minheap);
		return minheap.size();

	}
}
