package Recursion.sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[]={7,2,9,3};
        selections(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selections(int[] arr,int r,int c,int max){
        if(r==0) return;

        if(r>c){
            if(arr[c]>arr[max]){
                max=c;
            }
            selections(arr, r, c+1,max);
        }
        else{
            int temp=arr[r-1];
                arr[r-1]=arr[max];
                arr[max]=temp;
            selections(arr, r-1, 0,0);
        }
    }
}
