package BinarySearch.Practice;

import java.util.Arrays;

public class first_and_last {
    public static void main(String[] args) {
        int[] arr={4,7,7,7,7,8,10};
        int target=7;
        int ans[]=search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int[] arr,int target){
        int[] ans={-1,-1};
  
        ans[0]=first_and_last(arr,target,true);
        ans[1]=first_and_last(arr,target,false);
        return ans;
    }
    public static int first_and_last(int[] arr,int target,boolean findIndex){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(end>=st){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findIndex){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return ans;
    }
}
