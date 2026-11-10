package prefixSum;

import java.util.*;
public class CountSubArraySumOfK {
    public static void main(String[] args) {
        
        // 1st lets take subarray of positive elements.
        int[] nums = {1,2,3,1,1,1,4,2,3};
        int k = 3;
        int ans = CountSubArraySum(nums, k);
        System.out.println(ans);

        // 2nd if the array contains negative elements
        int[] nums2 = {10, 0, 5, 2, 7, 1, -10};
        k = 15;
        int ans2 = CountSubArraySum2(nums2, k);
        System.out.println(ans2);
    }
    
    public static int CountSubArraySum2(int[] nums, int k){

        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum == k) count++;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static int CountSubArraySum(int[] nums, int k){
        
        int left = 0, right = 0;
        int n = nums.length;
        int sum = 0, maxlen = 0;

        while(right < n){
            sum += nums[right];

            while(sum > k){
                sum -= nums[left];
                left++;
            }

            if(sum == k){
                maxlen = Math.max(maxlen, right - left + 1);
            }

            right++;
        }
        return maxlen;
    }

}
