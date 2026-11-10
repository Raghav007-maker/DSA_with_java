package DP;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    static int dp[];
    public static void main(String[] args){
        
        int[] cost = {10, 15, 20};
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        // m-1 -- recursion + memorization
        // int ans =  Math.min(minCost(cost, 0), minCost(cost, 1));
        // system.out.println(ans);
        
        // m-2 -- tabulation
        int ans = minCost2(cost, 0);
        System.out.println(ans);


    }
    static int minCost2(int[] cost, int idx){
        int n = cost.length;
        int[] dp = new int[n];

        dp[0] = cost[0];
        if(n >= 1) dp[1] = cost[1];

        for(int i = 2; i < n; i++){
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }


    static int minCost(int[] cost, int idx){
        
        if(idx >= cost.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = cost[idx] + Math.min(minCost(cost, idx + 1), minCost(cost, idx + 2));
        
    } 
}
