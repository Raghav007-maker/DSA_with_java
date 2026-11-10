package Recursion.BasicRecrssion;

public class binarySearchInRec {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 66, 77, 78};
        int target = 67;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);

    }

    public static int binarySearch(int[] arr, int target, int st, int end) {
        if (st > end) {
            return -1;
        }
        int mid = st + (end - st) / 2;
        if (arr[mid] > target) {
            return binarySearch(arr, target, st, mid - 1);
        }
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return mid;
    }

}
