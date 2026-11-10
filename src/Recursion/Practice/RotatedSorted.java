package Recursion.Practice;

public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,1,2,3};
        int target=3;
        int ans=rotatedSoreted(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    public static int rotatedSoreted(int[] arr,int target,int s,int e){
        if(s>e)return -1;

        int mid=s+(e-s)/2;

        if(target==arr[mid]){
            return mid;
        }

        if(arr[mid]>=arr[s]){
            if(arr[s]<=target && arr[mid]>=target){
                return rotatedSoreted(arr,target,s,mid-1);
            }
            else{
                return rotatedSoreted(arr,target,mid+1,e);
            }
        }

        if(target>=arr[mid] && target<=arr[e]){
            return rotatedSoreted(arr,target,mid+1,e);
        }
        return rotatedSoreted(arr,target,s,mid-1);
        
    }
}
