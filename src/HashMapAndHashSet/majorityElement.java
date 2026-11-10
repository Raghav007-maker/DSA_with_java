package HashMapAndHashSet;

import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        
        int[] arr = {1,2};
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele:arr){
            // if(map.containsKey(ele)){
            //     map.put(ele,map.get(ele) + 1);
            // }
            // else{
            //     map.put(ele,1);
            // }
            map.put(ele,map.getOrDefault(ele,0) + 1);
        }

        System.out.println(map);

        for(int val:map.keySet()){
            if(map.get(val) > n/3){
                System.out.print(val+" ");
            }
        }

    }
}