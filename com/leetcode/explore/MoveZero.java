package com.leetcode.explore;
import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		int[] a = new int[] {0,1};
		 moveZero(a);
	}

	private static void moveZero(int[] a) {
		
		int temp[] = new int[a.length];
		int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[j] = a[i];
                System.out.println(a[j]);
               j++;
            }
        }
        for(int i=j;i<a.length;i++) {
        	a[i]=0;
        }
		System.out.println(Arrays.toString(a));
	}

}
