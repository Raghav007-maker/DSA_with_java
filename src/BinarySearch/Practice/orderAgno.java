package BinarySearch.Practice;

public class orderAgno {
    public static void main(String[] args) {
        int[] arr={100,90,78,57,45,23};
        
        int target=90;
        int ans=agnostic(arr,target);
        System.out.println(ans);
        
    }

    public static int agnostic(int[] arr,int target){
        if(arr[arr.length-1]>arr[0]){
            return binarySearch(arr,target);
        }
        
        return binarySearch2(arr,target);
        
    }

    private static int binarySearch2(int[] arr, int target) {
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(target< arr[mid]){
                
                st=mid+1;
            }
            
            else if(target>arr[mid]){
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(target< arr[mid]){
                end=mid-1;
            }
            
            else if(target>arr[mid]){
                st=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
