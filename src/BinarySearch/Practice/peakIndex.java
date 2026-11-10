package BinarySearch.Practice;

public class peakIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,6,3,2};
        int ans=peakIndex(arr);
        System.out.println(ans);

    }
    public static int peakIndex(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(end>st){
            int mid=st+(end-st)/2;
            if(arr[mid+1]>arr[mid]){
                st=mid+1;
            }
            else{
                end=mid;
            }
        }
        return st;
    }
}
