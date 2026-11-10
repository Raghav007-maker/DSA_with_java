package String;
import java.util.*;
public class print_LCS{

    public static void main(String[] args){

        String s1 = "anuj";
        String s2 = "anjum";
        // System.out.println(lcs(s1, s2));

        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1))  dp[i][j] =  1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        int i = m;
        int j = n;
        StringBuilder lcs = new StringBuilder();
        while(i > 0 && j > 0){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                        lcs.append(s1.charAt(i-1));
                        i--;
                        j--;
                }

                else {
                        if(dp[i][j-1] >= dp[i-1][j]){
                                j--;
                        }
                        else{
                                i--;
                        }
                }
        }
        lcs.reverse();

        System.out.println(lcs);
        i = 0;
        j = 0;

        int k = 0;
        StringBuilder scs = new StringBuilder();
        while(i < s1.length() || j < s2.length()){
            while(s1.charAt(i) != lcs.charAt(k)){
            }
        }
    }
}