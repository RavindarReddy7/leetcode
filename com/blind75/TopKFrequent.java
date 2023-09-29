package com.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 1, 2, 2, 3, 4, 4 };

		System.out.println(Arrays.toString(topKFrequent(nums, 3)));
	}

	    public static int[] topKFrequent(int[] nums, int k) {
	        // O(1) time
	        if (k == nums.length) {
	            return nums;
	        }
	        
	        // 1. build hash map : character and how often it appears
	        // O(N) time
	        Map<Integer, Integer> count = new HashMap();
	        for (int n: nums) {
	          count.put(n, count.getOrDefault(n, 0) + 1);
	        }

	        System.out.println(count);
	        
	        // init heap 'the less frequent element first'
	        Queue<Integer> heap = new PriorityQueue<>(
	            (n1, n2) -> count.get(n1) - count.get(n2));

	        // 2. keep k top frequent elements in the heap
	        // O(N log k) < O(N log N) time
	        for (int n: count.keySet()) {
	        	//System.out.println("n: "+ n);
	          heap.add(n);
	          System.out.println(heap);
	          if (heap.size() > k) heap.poll();    
	        }

	        // 3. build an output array
	        // O(k log k) time
	        int[] top = new int[k];
	        for(int i = k - 1; i >= 0; --i) {
	        	
	        	System.out.println(top[i]);
	            top[i] = heap.poll();
	        }
	        return top;
	    }
	}
	
