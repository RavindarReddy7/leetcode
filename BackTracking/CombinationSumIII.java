package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static void main(String[] args) {

		List<List<Integer>> res = combination(9, 3);

		System.out.println(res);
	}

	private static List<List<Integer>> combination(int sum, int n) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		
		backTrack(1,sum,n,new ArrayList<>(), result);

		
		return result;
	}

	private static void backTrack(int start, int target, int n, List<Integer> curr, List<List<Integer>> result) {
		
		if(target ==0 && n==0) {
			
			result.add(new ArrayList<>(curr));
			
			return;
	 }
		
		if(n==0) {
			return;
		}
		
		
		for(int i = start;i<10;i++) {
			
			curr.add(i);
			
			backTrack(i+1, target-i,n-1, curr,result);
			
			curr.remove(curr.size()-1);
			
		}
	}

	
}
