package prefixSum;

import java.util.HashMap;

public class LongestSubArraySumOfK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int ans = longestSubarray(arr, k);
        System.out.println(ans);
    }
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int[] ps = new int[n];
        
        
        ps[0] = arr[0];
        for(int i = 1 ; i < n; i++){
            ps[i] = ps[i - 1] + arr[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            
            if(ps[i] == k) maxLen = Math.max(maxLen, i + 1);
            
            int val = ps[i] - k;
            if(map.containsKey(val)){
                maxLen = Math.max(maxLen, i - map.get(val));
            }
            
            if(!map.containsKey(ps[i])){
                map.put(ps[i], i);
            }
        }
        
        return maxLen;
    }
}
