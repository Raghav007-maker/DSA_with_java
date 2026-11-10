package twoPointers;

import java.util.Arrays;

public class sort_0And1 {
    public static void main(String[] args) {

        int[] arr={1,0,1,0,1,0,1,0,1,0};

        sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2={1,1,0,1,1,0,0,0};
        optimizeApproch(arr2);
        System.out.println(Arrays.toString(arr2));
        
    }
    public static void sort(int[] arr){
        int count0=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count0++;
            }
        }

        for(int i=0;i<count0;i++){
            arr[i]=0;
        }

        for(int i=count0;i<arr.length;i++){
            arr[i]=1;
        }
    }


    public static void optimizeApproch(int[] arr){
        
        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            else if(arr[left] != 1){
                left++;
            }
            else{
                right--;
            }
        }
    }
    public static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;  
    }
}
