package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Missing_Element_in_Range {

    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : arr) set.add(ele);

        for(int i = low; i <= high; i++){
            if(!set.contains(i)) list.add(i);
        }

        return list;
    }
}
