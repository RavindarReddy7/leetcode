package dynamicProgramming;

public class GridTraveller {

	public static void main(String[] args) {

		int m=4,n=4;
		int[][] dp = new int [m+1][n+1];
		
		System.out.println(grid(3,3,dp));
	}
	
	public static int grid(int m, int n,int[][] dp) {
		
		if(n==1 || m==1) {
			return  dp[m][n]=1;
		}
		if(dp[m][n]==0) {
			
			dp[m][n] = grid(m-1,n,dp) + grid(m,n-1,dp);
			//System.out.println(dp[m][n]);
		}
		
		return dp[m][n];
	}

}
