import java.util.*;

public class burst_ballon {
    public static void main(String[] args) {
      int[] arr = {3, 1, 5, 8};

      int[] a = new int[arr.length + 2];

      a[0] = a[arr.length + 1] = 1;
      for(int i = 0; i < arr.length; i++){
        a[i + 1] = arr[i];
      }

      int[][] dp = new int[a.length + 2][a.length + 2];

      for(int[] row : dp){
        Arrays.fill(row, -1);
      }

      System.out.println(max_coins(a, 0, a.length - 1, dp));
    }

    public static int max_coins(int[] nums, int si, int ei, int[][] dp){

      if(si + 1 == ei) return 0;
      if(dp[si][ei] != -1) return dp[si][ei];

      int ans = Integer.MIN_VALUE;
      for(int i = si + 1; i < ei; i++){
        int l = max_coins(nums, si, i, dp);
        int r = max_coins(nums, i, ei, dp);

        int s = nums[si] * nums[i] * nums[ei];

        int t = l + r + s;

        ans = Math.max(ans, t);
      }

      return dp[si][ei] = ans;

    } 
}