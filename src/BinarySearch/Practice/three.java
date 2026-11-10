package BinarySearch.Practice;
import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        int[] ans=ans(arr,target);
        System.out.println(Arrays.toString(ans));
    }    
    public static int[] ans(int[] arr,int target){
        int[] ans={-1,-1};
        boolean first;
        ans[0]=binarysearch(arr,target,true);
        ans[1]=binarysearch(arr,target,false);
        return ans;
        
    }
    public static int binarysearch(int[] arr,int target,boolean first){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(end>=st){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(first){
                    end=mid-1;
                }
                else st=mid+1;
            }
        }
        return ans;
    }

}
