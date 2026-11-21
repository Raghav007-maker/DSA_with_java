package DP;

public class Subsequence_with_Sum_K {
    public boolean checkSubsequenceSum(int[] arr, int k) {

        int n = arr.length;
        Boolean[][] dp = new Boolean[k + 1][n + 1];

        return subSequence(arr, k, 0, 0, dp);
    }

    public boolean subSequence(int[] arr, int k, int sum, int i, Boolean[][] dp){

        if(sum == k) return true;
        if(sum > k || i >= arr.length) return false;

        if(dp[sum][i] != null) return dp[sum][i];

        boolean pick = subSequence(arr, k, sum + arr[i], i + 1, dp);
        boolean skip = subSequence(arr, k, sum, i + 1, dp);

        return dp[sum][i] = pick || skip;
    }

    public boolean subSequence2(int[] arr, int k){

        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][k + 1];

        for(int i = 0; i <= n; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k; j++){

                boolean skip = dp[i - 1][j];

                boolean pick = false;
                if(j >= arr[i - 1]){
                    pick = dp[i - 1][j - arr[i - 1]];
                }

                dp[i][j] = skip || pick;
            }
        }

        return dp[n][k];
    }
}
