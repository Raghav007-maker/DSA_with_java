package String;
import java.util.*;
public class longest_common_subseq {

    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "BCD";
        // System.out.println(lcs(s1, s2));

        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1))  dp[i][j] =  1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        System.out.println(dp[m - 1][n - 1]);
    }



    public static int lcs(String s1, String s2){
        
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return LCS(new StringBuilder(s1), new StringBuilder(s2) , m-1, n-1, dp);
    }

    public static int LCS(StringBuilder s1, StringBuilder s2, int i, int j, int[][] dp){

        if(i < 0 ||  j < 0) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] =  1 + LCS(s1, s2, i - 1, j - 1,dp); 

        return dp[i][j] = Math.max(LCS(s1, s2, i - 1, j, dp), LCS(s1, s2, i, j - 1,dp));
    }

    public static int tabulationLCS(String s1, String s2){

        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                int x = (i - 1 >= 0 && j - 1 >= 0) ? dp[i - 1][j - 1] : 0;
                int y = (i - 1 >= 0) ? dp[i - 1][j] : 0;
                int z = (j - 1 >= 0) ? dp[i][j - 1] : 0;
                if(s1.charAt(i) == s2.charAt(j))  dp[i][j] =  1 + x;
                else dp[i][j] = Math.max(y, z);
            }
        }
        
        return dp[m - 1][n - 1];
    }
}