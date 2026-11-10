package BinarySearch.Practice;

public class agnostic {
    // if you don,t know that array is sorted in asc or desc
    public static void main(String[] args) {
        int[] arr={100,90,78,57,45,23};
        
        int target=57;
        int ans=binary(arr,target);
        System.out.println(ans);
    }
    public static int binary(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        boolean isAsc=arr[end]>arr[st];
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
}

