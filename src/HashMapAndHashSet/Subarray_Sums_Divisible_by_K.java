package HashMapAndHashSet;

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        int sum = 0;
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            int rem = sum % k;

            if(rem < 0) rem += k; // this id done due to negatve elements in the array we can also use rem = ((sum % k) + k) % k

            if(map.containsKey(rem)){
                ans += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}
