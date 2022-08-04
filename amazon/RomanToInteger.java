package com.amazon;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int s = intToRoman("MCMXCIV");

		System.out.println(s);
	}

	public static int intToRoman(String str) {
		
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		
		int num = map.get(str.charAt(str.length()-1));
		
		for(int i= str.length()-2;i>= 0;i--) {
			System.out.println( str.charAt(i)+" i");
			System.out.println( str.charAt(i+1)+" i+1");
			if(map.get(str.charAt(i))< map.get(str.charAt(i+1))) {
				num = num-map.get(str.charAt(i));
			}
			else {
				num=num +map.get(str.charAt(i));
			}
		}
		
return num;
	}
}
