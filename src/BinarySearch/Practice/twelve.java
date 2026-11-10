package BinarySearch.Practice;

import java.util.Arrays;

public class twelve {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,1};
        cyclic(arr);
    }
    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int correct,int index) {
        int temp=arr[index];
        arr[index]=arr[correct];
        arr[correct]=temp;
    }
}
