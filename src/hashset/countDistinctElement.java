package hashset;

import java.util.HashSet;

public class countDistinctElement {
    public static int distinceElement(int[] arr){
        HashSet<Integer> set= new HashSet<>();

        for(int ele : arr) set.add(ele);
        return set.size();

    }
}
