package Recursion.Practice;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        // System.out.println(SubSet(arr));
        System.out.println(duplicatesSubset(arr));
    }
    public static ArrayList<ArrayList<Integer>> SubSet(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int ele:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(ele);
                outer.add(internal);
            }

        }
        return outer;        
    }

    public static ArrayList<ArrayList<Integer>> duplicatesSubset(int[] arr){
        ArrayList<ArrayList<Integer>> outer =new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num:arr){
            int size=outer.size();
            for(int i=0;i<size;i++){
                ArrayList<Integer> internal =new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!(outer.contains(internal))){
                    outer.add(internal);
                }
            }
        }
        return outer;

    }
}
