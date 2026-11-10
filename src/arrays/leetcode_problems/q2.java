package arrays.leetcode_problems;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        
        
        int ans=oddCells(2,3,indices);
        System.out.println(ans);
        
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int i=0;i<indices.length;i++){
            create(arr,indices[i][0],indices[i][1]);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void create(int[][] arr,int row,int col){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==row){
                    arr[i][j]+=1;
                }
                if(j==col){
                    arr[i][j]+=1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
