package Recursion.Practice;

import java.util.ArrayList;

public class print {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5};
        int target=5;
        ArrayList<Integer> ans=LinearSearch(arr,target,0);
        System.out.println(ans);

    }
    public static ArrayList<Integer> LinearSearch(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==index) return list;

        if(target==arr[index])list.add(index);

        ArrayList<Integer> ansFromBelow=LinearSearch(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
