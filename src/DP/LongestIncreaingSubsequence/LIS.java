package LongestIncreaingSubsequence;
import java.util.*;
public class LIS{

    public static void main(String[] args){

    }
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return helper(nums, 0, -1, dp);
    }

    // idx -> 0 - n-1     (prev -> -1 - n-1) ---> (0, n)
    public int helper(int[] nums, int idx, int prev, int[][] dp){

        if(idx >= nums.length) return 0;
        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];

        int skip = helper(nums, idx + 1, prev, dp);
        if(prev != -1 && nums[idx] <= nums[prev]) return dp[idx][prev+1] = skip;
        int take = 1 + helper(nums, idx + 1, idx, dp);

        return dp[idx][prev+1] = Math.max(take, skip);
    }



    // M-2 ---> tabulation

    public int lisTabulation(int arr[]) {
        // code here
        
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 1;
        
        for(int i = 1; i < n; i++){
            
            int max = 0;
            for(int j = i - 1; j >= 0; j--){
                
                if(arr[i] > arr[j]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}