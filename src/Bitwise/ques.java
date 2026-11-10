package Bitwise;

import java.util.Arrays;

public class ques {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,1,3,4,6,6};

        // Brute Force
        // Arrays.sort(arr);
        // int no=arr[arr.length-1];
        // for(int i=0;i<arr.length-1;i+=2){
        //     if(arr[i]!=arr[i+1]){
        //         no=arr[i];
        //         break;
        //     }
        // }
        // System.out.println(no);

        int ans=XOR(arr);
        System.out.println(ans);

    }
    public static int XOR(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
}
