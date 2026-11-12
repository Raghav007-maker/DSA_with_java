package HashMapAndHashSet;

import java.util.HashMap;

public class check_Subarray_Sum {

    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //base for sum % k == 0 length must be atleast 2 as given in ques.
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(map.containsKey(sum % k)){
                if(Math.abs(map.get(sum % k) - i) >= 2){
                    return true;
                }
            }
            else map.put(sum % k, i);
        }

        return false;
    }
}
