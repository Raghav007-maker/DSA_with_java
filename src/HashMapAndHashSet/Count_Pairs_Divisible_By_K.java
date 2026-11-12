package HashMapAndHashSet;

import java.util.HashMap;

public class Count_Pairs_Divisible_By_K {
    public int countKdivPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i] % k, map.getOrDefault(arr[i] % k, 0) + 1);

        }
        int ans = 0;
        long zeroCount = map.getOrDefault(0, 0);
        ans += zeroCount * (zeroCount - 1) / 2;
        map.remove(0);

        if(k % 2 == 0){
            long half = map.getOrDefault(k/2, 0);
            ans += half * (half - 1) / 2;
            map.remove(k/2);
        }

        ans *= 2;

        for(int key : map.keySet()){

            if(map.containsKey(k - key)){
                ans += map.get(k - key) * map.get(key);
            }
        }

        return ans / 2;
    }
}
