package com.leetcode.explore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagram {
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        
         List<List<String>> stringlist = new ArrayList<>();
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] arr = str.toCharArray();
            
            Arrays.sort(arr); 
            
            System.out.println("string -> "+String.valueOf(arr));
            
            String key = String.valueOf(arr);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
                map.get(key).add(str);
                
                System.out.println(map);
        }
        
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            stringlist.add(entry.getValue());
        }
        return stringlist;
    }
    
    public static void main(String[] args) {

    	String[] strs = {"eat","tea","tan","ate","nat","bat"};
    	
        List<List<String>> stringlist = groupAnagrams(strs);
        System.out.println(stringlist);
	}
}