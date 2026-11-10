package BinarySearch.Practice;

import java.util.Arrays;

public class first_last {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=11;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        
    }
    public static int[] search(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=binarysearch(arr,target,true);
        ans[1]=binarysearch(arr,target,false);
        return ans;
    }

    public static int binarysearch(int[] arr,int target,boolean left){
        int st=0;
        int end=arr.length-1;
        int ans=-1;

        while(end>=st){
            int mid=st+(end-st)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target) st=mid+1;
            else{
                ans=mid;
                if(left){
                    end=mid-1;
                }
                else st=mid+1;
            }
        }
        return ans;
    }
}
