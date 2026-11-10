package DP;
public class NumberOfPaths {

    static int[][] dp;
    public static void main(String[] args){

        int m = 3;
        int n = 3;
        dp = new int[m + 1][n + 1];

        int ans = numberOfPaths(m,n);
        System.out.println(ans);
    }

    public static int numberOfPaths(int m, int n) {
        // code here
        if(m == 1 || n == 1) return 1;

        if(dp[m][n] != 0) return dp[m][n];
        dp[m][n] = numberOfPaths(m, n - 1) + numberOfPaths(m - 1, n);
        return dp[m][n];
    }
}
