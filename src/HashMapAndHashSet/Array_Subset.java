package HashMapAndHashSet;

import java.util.HashMap;

public class Array_Subset {

    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }


        for(int i = 0; i < b.length; i++){
            if(map.containsKey(b[i])){
                map.put(b[i], map.get(b[i]) - 1);
                if(map.get(b[i]) == 0) map.remove(b[i]);
            }
            else return false;
        }

        return true;
    }
}
