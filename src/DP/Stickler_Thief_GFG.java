

import java.util.Arrays;

public class Stickler_Thief_GFG {
    static int[] dp;
    public static void main(String[] args){

        int[] arr = {6, 7, 1, 3, 8, 2, 4};
        dp = new int[arr.length];
        Arrays.fill(dp, -1);
        // m-1
        // System.out.println(loot(0, arr));

        // m-2
        System.out.println(loot2(0, arr));
    }
    
    public static int loot2(int idx, int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        if(n >= 1) dp[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];

    }
    public static int loot(int idx, int[] arr){
        
        if(idx >= arr.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        
        int pick = arr[idx] + loot(idx + 2, arr);
        int skip = loot(idx + 1, arr);
        
        int ans = Math.max(pick, skip);
        dp[idx] = ans;
        return ans;
        // or return dp[idx] = Math.max(pick, skip);
    }
}
