package Recursion.ArraysQues;

public class sortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,8,9};
        boolean ans=isSorted(arr,0,1);
        System.out.println(ans);
    }
    public static boolean isSorted(int[] arr,int first ,int second){
        if(arr.length-1==second && arr[second]>=arr[first]){
            return true;
        }
        if(arr[second]>=arr[first]){
            return isSorted(arr,first+1,second+1);
        }
        return false;
    }
    public static boolean isSorted(int[] arr, int index) {
    // Base case: If we reach the last element, the array is sorted
    if (index == arr.length - 1) {
        return true;
    }
    // If any pair is out of order, return false
    if (arr[index] > arr[index + 1]) {
        return false;
    }
    // Recursive call
    return isSorted(arr, index + 1);
}
}
