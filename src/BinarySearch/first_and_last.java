// ques:find first and last position of element in sorted array
package BinarySearch;

import java.util.Arrays;

public class first_and_last {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        int[] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] arr,int target){

        int[] ans={-1,-1};
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);

        return ans;

    }
    
    public static int search(int[] nums,int target, boolean findStartIndex){
        int st=0;
        int end=nums.length-1;
        int ans=-1;
        while(end>=st){
            int mid=st+(end-st)/2;
            if(target>nums[mid]){
                st=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findStartIndex){
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
