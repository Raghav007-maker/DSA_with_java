// https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=binary-search
package BinarySearch;

public class q1 {
    public static void main(String[] args) {
        int[] nums={2,3,5,6};
        int target=3;
        int ans=searchInsert(nums,target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums,int target){
        int st=0;
        int end=nums.length-1;
        if(target>nums[end]) return nums.length;
        while(end>=st){
            int mid=st+(end-st)/2;
            if(target>nums[mid]){
                st=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else return mid;
        }
        return st;

    }
}
