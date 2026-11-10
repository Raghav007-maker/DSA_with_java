package BinarySearch.Practice;
public class eight {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            binarysearch(arr, target, 0, arr.length - 1);
        }
        if (pivot == target) {
            return pivot;
        }
        if (target >= arr[0]) {
             return binarysearch(arr, target, 0, pivot - 1);
        }
        if (target < arr[0]) {
            return binarysearch(arr, target, pivot + 1, arr.length - 1);
        }
        return -1;

    }

    public static int binarysearch(int[] arr, int target, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int pivot(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        while (end >= st) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[st] >= arr[mid]) {
                end = mid - 1;
            } else if (arr[st] < arr[mid]) {
                st = mid + 1;
            }
        }
        return -1;
    }
}
