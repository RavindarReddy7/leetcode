package dynamicProgramming;

public class FibnacciSeries {

	public static void main(String[] args) {

		System.out.println(fib(20));
	}

	
	public static int fib(int n) {
		
		int[] mem = new int[n+2];
		 
		mem[0]=0;
		mem[1]=1;
		for(int i=2;i<=n;i++) {
			
			mem[i]= mem[i-1]+mem[i-2];
			System.out.println(mem[i]);
		}
		
		
		return mem[n];
		
	}
}
