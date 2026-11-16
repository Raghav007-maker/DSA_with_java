package DP;

public class Minimum_Falling_Path_Sum {
    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

//      fill dp last row with matrix last row elements
        for(int i = 0; i < n; i++){
            dp[m - 1][i] = matrix[m - 1][i];
        }

//
        for(int i = m - 2; i >= 0; i--){
            for(int j = 0; j < n; j++){

                int left = (j > 0) ? dp[i + 1][j - 1] : Integer.MAX_VALUE;

                int down = dp[i + 1][j];

                int right = (j < n - 1) ? dp[i + 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(left, Math.min(down, right));
            }
        }

        int min = dp[0][0];

        for(int i = 0; i < n; i++){
            min = Math.min(min, dp[0][i]);
        }

        return min;
    }
}
