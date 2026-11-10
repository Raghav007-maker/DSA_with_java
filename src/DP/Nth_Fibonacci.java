package DP;

public class Nth_Fibonacci {
    
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n + 1]; 
        // memorization technique..
        System.out.println(nthFibonacci(dp, n));
        
        // tabulation
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
        int ans = fibo_tabul_optimize(n);
        System.out.println(ans);
    }

    public static int nthFibonacci(int[] dp, int n) {
        nthFibonacci(dp, n);
        return dp[n];
    }

//    public static int fibo(int n){
//        if(n <= 1){
//            dp[1] = 1;
//            return n;
//        }
//        if(dp[n] != 0) return dp[n];
//
//        return dp[n] = nthFibonacci(dp, n - 1) + nthFibonacci(dp, n - 2);
//    }


    static int fibo_tabul_optimize(int n) {
        
        if(n <= 1) return n;
        int[] dp = new int[3];
        dp[1] = 1;
        
        for(int i = 1; i < n; i++){
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2]; 
        }
        return dp[2];
        
    }
}
