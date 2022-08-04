package com.leetcode.explore;

public class ReverseString {
	
	public static int reverse(int x) {
        int y=0;
        while(x!=0){
        int rem= x%10;
            x = x/10;
            
            if(y > Integer.MAX_VALUE/10 || y == Integer.MAX_VALUE/10 && rem > 7){
        return 0 ;
      }
 
      if(y < Integer.MIN_VALUE/10 || y == Integer.MIN_VALUE/10 && rem < -8){
        return 0 ;
      }
              y = y*10 + rem ;
        
        }
        return y;
    }

	public static void main(String[] args) {

		int x= 654321;
		int z = reverse(x);
		System.out.println(z);
		
	}

}
