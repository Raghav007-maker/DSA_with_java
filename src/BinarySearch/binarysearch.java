package BinarySearch;
import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18};
        // we have taken the sorted array where we know the array is in ascending order 
        // what if we have a sorted array but we dont know if it is sorted in asc or desc?
        // sol:borderagnostic
        int target=sc.nextInt();
        int ans=binary(arr,target);
        System.out.println(ans);
        }
    }
    static int binary(int[] arr,int target){
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

