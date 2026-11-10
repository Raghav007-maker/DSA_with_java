package Recursion.ArraysQues;

public class rotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 9, 1, 2, 3};
        int target = 8;
        int ans = rotated(arr, target, 0, arr.length - 1);
        System.out.println(ans);

    }

    public static int rotated(int[] arr, int target, int st, int end) {
        if (end < st) {
            return -1;
        }

        int mid = st + (end - st) / 2;
        if (target == arr[mid]) {
            return mid;
        }

        if (arr[st] <= arr[mid]) {
            if (target >= arr[st] && arr[mid] >= target) {
                return rotated(arr, target, 0, mid - 1);
            } else {
                return rotated(arr, target, mid + 1, end);

            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return rotated(arr, target, mid + 1, end);
        } else {
            return rotated(arr, target, 0, mid - 1);//5,6,1,2,3
        }
    }
}
