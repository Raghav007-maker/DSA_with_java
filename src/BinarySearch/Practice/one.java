package BinarySearch.Practice;

public class one {
    public static void main(String[] args) {
        
        int[] arr={-23,1,23,67,90,111};
        int target=23;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        while(end>st){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
    
}
