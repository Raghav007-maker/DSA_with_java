package twoPointers;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};

        EvenFollowedOdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void EvenFollowedOdd(int[] arr){

        int left = 0;
        
        int right =arr.length - 1;

        while(left<right){

            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){

                swap(arr, left, right);
            }

            if(arr[left] % 2 == 0){
                 
                left++;
            }

            if(arr[right] % 2 != 0){
                 
                right--;
            }
        }

    }
    public static void swap(int[] arr,int left,int right){

        int temp = arr[left];
        
        arr[left] = arr[right];

        arr[right] = temp;  

    }
}
