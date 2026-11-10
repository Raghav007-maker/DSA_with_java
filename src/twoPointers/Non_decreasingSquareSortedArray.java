package twoPointers;

import java.util.Arrays;

public class Non_decreasingSquareSortedArray {
    public static void main(String[] args) {
        
        int[] arr={-10,-4,-2,1,4,5}; 

        int[] ans = SortedSquareArray(arr);

        reverse(ans);
        
        System.out.println(Arrays.toString(ans));
        
    }
    public static void reverse(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static int[] SortedSquareArray(int[] arr){

        int[] ans=new int[arr.length];

        int left = 0;
        
        int right = arr.length - 1;

        int i = 0;
        
        while(left < right){

            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[i] = arr[left]*arr[left];
                left++;
            }

            else{
                ans[i] = arr[right] * arr[right];
                right--;
            }   

            i++;
        }

        return ans;
    }
    
}
