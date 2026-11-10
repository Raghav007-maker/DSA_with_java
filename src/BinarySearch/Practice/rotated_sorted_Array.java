package BinarySearch.Practice;

public class rotated_sorted_Array {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10,34};
        int target=8;
        search(arr,target);
    }
    public static int search(int[] arr,int target){
        int pivot=pivot(arr);
        if(pivot==-1){
            binary(arr,target,0,arr.length-1);
        }
        // else if(pivot==)
        return -1;
    }
    public static int binary(int[] arr,int target,int st,int end){
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }
            else return mid;
        }
        return -1;
    }
    public static int pivot(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(end>=st){
            int mid=st+(end-st)/2;
            if(arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[st]>=arr[mid]){
                end=mid-1;
            }
            else st=mid+1;
        }
        return -1;
    }
    
}
