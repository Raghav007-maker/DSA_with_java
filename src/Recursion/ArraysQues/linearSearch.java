package Recursion.ArraysQues;

import java.util.ArrayList;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        int target = 4;
        // int ans = LinearSearch(arr, target, 0);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans = LinearArraySearch(arr, target, 0,list);
        ArrayList<Integer> ans2 = LinearArraySearch2(arr, target, 0);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static int LinearSearch(int[] arr, int target, int index) {
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return LinearSearch(arr, target, index + 1);
    }

    public static ArrayList<Integer> LinearArraySearch(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (arr.length == index) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return LinearArraySearch(arr, target, index + 1, list);
    }

    // what if we want to create a arraylist inside the function rather than passing it into argument
    // problem-:here if we create a arraylist in function that at every recursive call the new arraylist is creted!!
    public static ArrayList<Integer> LinearArraySearch2(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if (arr.length == index) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = LinearArraySearch2(arr, target, index + 1);
        list.addAll(ansfrombelowcalls);
        return list;
        // this approch take more spaces due to creating the arraylist again and again
        // but can be used in many questins.........
    }
}

