package HashMapAndHashSet;

import java.util.*;
public class UnionOf2Array {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        int ans = union(arr1,arr2);
        System.out.println(ans);

    }
    
    public static int union(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr1){
            set.add(ele);
        }
        for(int ele:arr2){
            set.add(ele);
        }

        return set.size();
    }
}
