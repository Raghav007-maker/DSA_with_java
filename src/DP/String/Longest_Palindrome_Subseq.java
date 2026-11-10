package String;

import java.util.*;

public class Longest_Palindrome_Subseq {
    public static int longestPalinSubseq(String s) {
        
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        return lcs(s1,s2);    
    }
    
    public static int lcs(StringBuilder s1, StringBuilder s2){

        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }

        return LCS(s1, s2, m-1, n-1, dp);
    }

    public static int LCS(StringBuilder s1, StringBuilder s2, int i, int j, int[][] dp){
        if(i < 0 || j < 0) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] =  1 + LCS(s1, s2, i - 1, j - 1, dp); 

        return dp[i][j] = Math.max(LCS(s1, s2, i - 1, j, dp), LCS(s1, s2, i, j - 1, dp));
    }
}