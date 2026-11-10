package BinarySearch.Practice;

public class roto {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int ans = search1(arr, target);
        System.out.println(ans);

    }

    public static int search1(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            return binary(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binary(arr, target, 0, pivot - 1);
        }
        return binary(arr, target, pivot + 1, arr.length - 1);
    }

    static int binary(int[] arr, int target, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
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
            if (end > mid && arr[mid + 1] < arr[mid]) {
                return mid;
            }
            if (st < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[st] >= arr[mid]) {
                end = mid - 1;
            }
            if (arr[mid] > arr[st]) {
                st = mid + 1;
            }
        }
        return -1;
    }
}
