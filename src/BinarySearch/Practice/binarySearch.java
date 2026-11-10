package BinarySearch.Practice;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={-40,-30,-12,0,12,34,68};
        int target=0;
        int ans=binary(arr,target);
        System.out.println(ans);
    } 
    public static int binary(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
