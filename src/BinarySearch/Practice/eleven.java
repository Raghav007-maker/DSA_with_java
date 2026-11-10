package BinarySearch.Practice;

import java.util.Arrays;

public class eleven {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6, 9, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j <= arr.length - i - 1; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, arr.length - 1 - i);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
