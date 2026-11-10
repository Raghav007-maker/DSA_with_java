package Recursion.Practice;

public class BS {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,66,77,78};
        int target=-83;
        int ans=bs(arr,0,arr.length-1,target);
        System.out.println(ans);
        
    }
    public static int bs(int[] arr,int st,int end,int target){

        if(st>end) return -1;
        int mid=st+(end-st)/2;

        if(arr[mid]>target){
            return bs(arr,st,mid-1,target);
        }
        else if(arr[mid]<target){
            return bs(arr,mid+1,end,target);
        }
        else return mid;
    }
}
