package BinarySearch.Practice;

public class two {
    public static void main(String[] args) {
        int[] arr={98,67,51,43,23};

        int target=1;
        int ans=check(arr,target);
        System.out.println(ans);
    }
    public static int check(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        boolean isasc=arr[st]<arr[end];
        
        int ans=binarySearch(arr,target,st,end,isasc);
        return ans;
        
    }
    public static int binarySearch(int[] arr,int target,int st,int end,boolean isAsc){
        if(isAsc){
            while(end>=st){
                int mid=st+(end-st)/2;
                if(target>arr[mid]) st=mid+1;
                else if(target<arr[mid]) end=mid-1;
                else return mid;
            }
        }
        else{
            while(end>=st){
                int mid=st+(end-st)/2;
                if(target<arr[mid]) st=mid+1;
                else if(target>arr[mid]) end=mid-1;
                else return mid;
            }

        }
        return -1;
    }
}
