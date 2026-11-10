package BinarySearch.Practice;

public class ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=19;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    public static int ceiling(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        if(target>arr[end]) return -1;
        while(end>=st){
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
