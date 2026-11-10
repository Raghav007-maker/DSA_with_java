package BinarySearch.Practice;

public class fifth {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=1;
        int ans=floor(arr,target);
        System.out.println(ans);
    }
    public static int floor(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        
        while(end>=st){
            int mid=st+(end-st)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target) st=mid+1;
            else return mid;
        }
        return end;
    }
}
