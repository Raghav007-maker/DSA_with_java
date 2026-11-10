package Recursion.String;

import java.util.ArrayList;

public class SubSet {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = subset(arr);
        System.out.println(ans);
        int arr1[] = {1, 2, 2};
        ArrayList<ArrayList<Integer>> ans2 = duplicatesubset(arr1);
        System.out.println(ans2);

    }

    public static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> Internal = new ArrayList<>(outer.get(i));
                Internal.add(num);
                outer.add(Internal);
            }
        }
        return outer;
    }

    public static ArrayList<ArrayList<Integer>> duplicatesubset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> Internal = new ArrayList<>(outer.get(j));
                Internal.add(arr[i]);
                outer.add(Internal);
            }
        }
        return outer;
    }

}
