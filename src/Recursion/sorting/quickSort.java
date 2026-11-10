package Recursion.sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    public static void quick(int[] arr,int low,int high){
        if(low>=high) return ;

        int st=low;
        int end=high;
        int mid=st+(end-st)/2;
        int pivot=arr[mid];

        while(st<=end){
            if(arr[st]<pivot){
                st++;
            }
            if(arr[end]>pivot){
                end--;
            }
            if(st<=end){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }
        }
        quick(arr,low,end);
        quick(arr,st,high);
    }

}
