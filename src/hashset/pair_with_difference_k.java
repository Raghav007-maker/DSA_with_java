package hashset;

import java.util.HashSet;

public class pair_with_difference_k {
    int countPairs(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int ele : arr) {
            set.add(ele);
        }

        int count = 0;
        for (int j : arr) {
            if (set.contains(j - k)) {
                count++;
            }
            if (set.contains(j + k)) {
                count++;
            }
        }
        return count;
    }
}
