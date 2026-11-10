package BinarySearch;

import java.util.Scanner;

public class orderAgnos {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        // int[] arr={-18,-12,-4,0,2,3,4,15,16,18};
        int[] arr={70,67,56,45,32,-10};
        // checking the difference of first and last element help to find the order of sorted array
        // also called order agnostic Binary Search
        int target=sc.nextInt();
        int ans=AgnosticBS(arr,target);
        System.out.println(ans);
        }
    }
    static int AgnosticBS(int[] arr,int target){
        int st=0;
        int end=arr.length-1;

        boolean isAsc=arr[end]>arr[st];
        // if() isAsc=true;
        // else isAsc=false;

        while(st<=end){
            int mid=st+(end-st)/2;
            
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(target< arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    st=mid+1;
                }
            }
            else{
                if(target> arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    st=mid+1;
                }

            } 
        }
        return -1;
    }
}
