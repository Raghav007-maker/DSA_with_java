package BinarySearch.Practice;

import java.util.Arrays;

public class binarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}};
        int target=28;
        System.out.println(Arrays.toString(searchIn2D(arr,target)));
    }
    public static int[] searchIn2D(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target) return new int[]{row,col};
            else if(arr[row][col]>target){
                col--;
            }
            else row++;
        }
        return new int[]{-1,-1};
    } 
}
