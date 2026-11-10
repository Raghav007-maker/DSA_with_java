package Recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr={3,14,56,9};
    // bubble(arr,arr.length-1,0);//we have to take arr.length-1 due to index out of bound
    // System.out.println(Arrays.toString(arr));
    sort(arr,0,0);
    System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr,int r,int c){
        if(r==0) return;

        if(r>c){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, c+1);
        }
        else{
            bubble(arr, r-1, 0);
        }
    }

    public static void sort(int[] arr,int i, int j){
        int n = arr.length;
        if(i == n - 1) return;
        if(j == n - 1 - i){
            sort(arr, i+1, 0);
            return;
        }
        if(arr[j] > arr[j + 1]){
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

        }
        sort(arr, i, j+1);
    }
}
