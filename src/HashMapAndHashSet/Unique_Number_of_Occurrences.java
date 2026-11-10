package HashMapAndHashSet;


import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurrences {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int key : map.keySet()){
            if(set.contains(map.get(key))) return false;
            set.add(map.get(key));
        }
        return true;
    }
}
