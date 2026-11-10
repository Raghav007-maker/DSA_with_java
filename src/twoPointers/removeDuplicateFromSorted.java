package twoPointers;

import java.util.Arrays;

public class removeDuplicateFromSorted {
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3,3,3,4};
        int reqAns=4;
        int[] reqArray = {1,2,3,4};
        
        // 1st method
        // Brute-Force
        int ans=removeDuplicates(arr);

        boolean flag=true;
        for(int i=0;i<reqAns;i++){
            if(arr[i] != reqArray[i]){
                flag=false;
                break;
            }
        }
        System.out.println(flag);

        // 2nd method
        // Optimize Approch
        
        int[] arr2 = {1,2,2,3,3,3,4};
        Optimize(arr2);
        System.out.println(Arrays.toString(arr2));
        

    }
    public static int removeDuplicates(int[] arr){
        
        int uniq = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                uniq++;
            }
        }
        // System.out.println(uniq);

        int index = 1;

        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index++]=arr[i];
            }
        }

        return uniq;
    }

    public static int Optimize(int[] arr){
        int uniq = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[uniq] = arr[i];
                uniq++;
            }
        }
        return uniq;


        
    }
}
