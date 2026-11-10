public class Friends_Pairing_Problem {
    
    public static void main(String[] args) {

        // through recursion ---- TC : 2^n
        int ans = countFriendsPairings(4);
        System.err.println(ans);
        
        // through DP Memorization technique
        int n = 5;
        int[] dp = new int[n + 1];
        int ans2 = countFriendsPairings2(n, dp); 
        System.err.println(ans2);

        // through DP tabulation
        
        
        int ans3 = countFriendsPairings3(n);
        System.out.println(ans3);
    }

    public static int countFriendsPairings3(int n){
        int[] dp = new int[n + 1];
        if(n >= 1) dp[1] = 1;
        if(n >= 2) dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        return dp[n];
    }
    public static int countFriendsPairings2(int n, int[] dp){
        if(n <= 2) return n;

        if(dp[n] != 0) return dp[n];
        return dp[n] = countFriendsPairings2(n - 1, dp) + (n - 1) * countFriendsPairings2(n - 2, dp);

    }
    public static int countFriendsPairings(int n) {
        // code here
        if(n <= 2) return n;

        return countFriendsPairings(n - 1) + (n - 1) *countFriendsPairings(n - 2);
        
    }
}
