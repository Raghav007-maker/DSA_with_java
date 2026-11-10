package String;

import java.util.*;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
      
    }
    public String getLongestPal(String s) {
        // code here
        
        int n = s.length();
        int[][] dp = new int[n][n];
        
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int row = 0;
            for(int col = i; col < n; col++){

              if(row == col) dp[row][col] = 1;
              else if(s.charAt(row) == s.charAt(col)){
                if(col == row + 1)dp[row][col] = 2;
                else if(dp[row + 1][col - 1] != 0) dp[row][col] = dp[row + 1][col - 1] + 2;
              }

              maxLen = Math.max(maxLen, dp[row][col]);
              row++;
            }
        }

        String ans = "";
        for(int i = 0; i < n; i++){
            int row = 0;
            for(int col = i; col < n; col++){

              if(dp[row][col] == maxLen){
                ans = s.substring(row, col + 1);
                return ans;
              } 
              row++;
            }
        }

        return ans;
        
    }
}