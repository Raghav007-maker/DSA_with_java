package BinarySearch.Practice;

import java.util.Arrays;

public class ninth {
    public static void main(String[] args) {
        int[] arr={4,3,2,6,9,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

