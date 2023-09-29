package com.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

	public static void main(String[] args) {
		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };

		int[] newinterval = { 4, 8 };

		System.out.println(Arrays.deepToString(merge(intervals, newinterval)));
	}

	public static int[][] merge(int[][] intervals, int[] newInterval) {

		List<int[]> res = new ArrayList<>();

		int n = intervals.length;
		int i = 0;

		while (i < n && intervals[i][1] < newInterval[0]) {

			res.add(intervals[i++]);
		}

		while (i < n && intervals[i][0] <= newInterval[1]) {

			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);

			newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			i++;
			
			System.out.println("newInterval[0] + newInterval[1]->"+
					newInterval[0] + newInterval[1]);
		}

		res.add(newInterval);

		while (i < n) {
			res.add(intervals[i++]);
		}

		return res.toArray(new int[res.size()][2]);
	}
}