package String;

import java.util.*;
public class edit_distance {
    public int editDistance(String s1, String s2) {
        
        
        int a = s1.length() - 1;
        int b = s2.length() - 1;
        int[][] dp = new int [s1.length()][s2.length()];
        
        for(int i = 0 ; i < s1.length(); i++){
            Arrays.fill(dp[i], -1);
        }
        
        return edit(new StringBuilder(s1), new StringBuilder(s2), a, b,dp);
    }
    
    public static int edit(StringBuilder s1, StringBuilder s2, int i, int j, int[][] dp){
       
    
        if(i < 0) return j + 1;
        if(j < 0)  return i + 1;
        
        
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] =  edit(s1, s2, i - 1, j - 1,dp);
        }
        
        int replace = 1 + edit(s1, s2, i - 1, j - 1,dp);
        int delete = 1 + edit(s1, s2, i - 1, j,dp);
        
        int insert = 1 + edit(s1, s2, i, j - 1,dp);
        
        return dp[i][j] = Math.min(replace, Math.min(delete, insert));
    }
    
}