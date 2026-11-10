import java.util.*;

public class mixtures {
    public static void main(String[] args) {
      int[] arr = {40, 60, 20, 10};
      System.out.println(mini_smoke(arr, 0, arr.length - 1));
    }

    public static int mini_smoke(int[] arr, int si, int ei){

      if(si == ei) return 0;

      int ans = Integer.MAX_VALUE;
      for(int i = si; i < ei; i++){
        
        int x = mini_smoke(arr, si, i);
        int y = mini_smoke(arr, i + 1, ei);
        int self = colors(arr,si, i) * colors(arr, i + 1, ei);
        
        ans = Math.min(ans, x + y + self);

      }

      return ans;
    }

    public static int colors(int[] arr, int si, int end){
        int sum = 0;
        for(int i = si; i <= end; i++){
          sum += arr[i];
        }

        return sum % 100;
    }

}