package BinarySearch.Practice;

public class position_in_infinite {
    public static void main(String[] args) {
        int[] arr={-1,-2,-4,5,6,8,9,10,19};
        int target=8;
        int ans=infinite_array(arr,target);
        System.out.println(ans);
    }
    public static int infinite_array(int[] arr,int target){
        int st=0;
        int end=1;
        while(arr[end]<target){
            int newSt=end+1;
            end=end+(end-st+1)*2;
            st=newSt;
        }
        return BinarySearch(arr,target,st,end);
    }
    
    public static int BinarySearch(int[] arr,int target,int st,int end){
        while(end>=st){
            int mid=st+(end-st)/2;
            if(arr[mid]>target) end=mid-1;
            else if(arr[mid]<target) st=mid+1;
            else return mid;
        }
        return -1;
    }
}
