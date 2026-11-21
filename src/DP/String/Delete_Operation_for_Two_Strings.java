package DP.String;

import java.util.Arrays;

public class Delete_Operation_for_Two_Strings {
    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();
        int[][] dp= new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return distance(word1, word2, 0, 0, dp);
    }

    public int distance(String word1, String word2, int i, int j, int[][] dp){

        if(i >= word1.length()){
            return word2.length() - j;
        }
        if(j >= word2.length()){
            return word1.length() - i;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = distance(word1, word2, i + 1, j + 1, dp);
        }
        int remove1 = 1 + distance(word1, word2, i + 1, j, dp);
        int remove2 = 1 + distance(word1, word2, i, j + 1, dp);


        return dp[i][j] = Math.min(remove1, remove2);
    }
}
