package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> list = group(strs);

		//list.forEach(System.out::println);
		
		System.out.println(list);
	}

	public static List<List<String>> group(String[] strs) {

		if (strs == null || strs.length == 0)
		      return new ArrayList<>();
		
		List<List<String>> stringList = new ArrayList<>();

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);

			String key = String.valueOf(arr);

			System.out.println( key);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
				map.get(key).add(str);
			
		}
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				stringList.add(entry.getValue());

			}

		return stringList;
	}
}


/*
 * String sortedString = new String(arr); if(map.containsKey(sortedString)){
 * map.get(sortedString).add(s); }else{ List<String> list = new ArrayList();
 * result.add(list); list.add(s); map.put(sortedString, list); } } return
 * result;
 */