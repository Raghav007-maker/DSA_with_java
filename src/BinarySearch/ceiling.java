// ques: find the ceiling element from the array
// ceiling:element which is greater than or equal to the target
package BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=10;

        int ans=ceiling(arr,target);
        System.out.println(ans);
        // but what if the target is greater than the maximum value in the array
        // then no is t=not exist hence we return -1
        
    }
    static int ceiling(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        if(arr[end]<target){
            return -1;
        }
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else return arr[mid];
        }
        return arr[st];
    }
    
}
