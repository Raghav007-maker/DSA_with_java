package BinarySearch;

public class peak_index {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,6,3,2};
        int ans=peakValue(arr);
        System.out.println(ans);
    }
    public static int peakValue(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(end>st){
            int mid=st-(st-end)/2;
            if(arr[mid+1]>arr[mid]){
                st=mid+1;
            }
            else end=mid;
        }
        return st;
    }
}
        // in the end, start==end pointing to largest number because of 2 checks above
        // start and end always try to find max element in the two checks.
        // 
