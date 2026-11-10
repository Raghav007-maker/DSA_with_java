package sortingTechniques;

import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        ArrayList<Integer> l=cyclic(arr);
        System.out.println(l);
    }

    public static ArrayList<Integer> cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        } 
        ArrayList<Integer> ans=new ArrayList<>(10);
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }      
        return ans;
    }

    public static void swap(int[] arr, int correct,int index) {
        int temp=arr[index];
        arr[index]=arr[correct];
        arr[correct]=temp;
    }
}
