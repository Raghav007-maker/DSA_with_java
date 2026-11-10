package HashMapAndHashSet;

import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        int ans = intersection(arr1,arr2);
        System.out.println(ans);
    }
    public static int intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr1){
            set.add(ele);
        }

        int intersection = 0;
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                intersection++;
                set.remove(arr2[i]);
            }
        }
        return intersection;
    }
}
