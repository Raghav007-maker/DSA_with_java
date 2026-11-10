// search in rotated sorted array
package BinarySearch;

public class rotated_sorted {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums,int target){
        int pivot=findPivot(nums);
        // if you did not find the pivot,it mena sthe array is not rotated
        if(pivot==-1){
            return binary(nums,target,0,nums.length-1); 
        }
        
        if(nums[pivot]==target){
            return pivot;
        }
            // If the target is in the left sorted portion
        if (target >= nums[0] && target <= nums[pivot - 1]) {
            return binary(nums, target, 0, pivot - 1);
        }

        // Otherwise, it's in the right sorted portion
        return binary(nums, target, pivot + 1, nums.length - 1);
    }
    
    static int binary(int[] arr,int target,int st,int end){

        while(st<=end){
            int mid=st+(end-st)/2;

            if(target< arr[mid]){
                end=mid-1;
            }
            
            else if(target>arr[mid]){
                st=mid+1;
            }
            else return mid;
        }
        return -1;
    }
    public static int findPivot(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(end>=st){
            int mid=st+(end-st)/2;
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid; 
            }
            if(mid>st && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[st]>=arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }
}
