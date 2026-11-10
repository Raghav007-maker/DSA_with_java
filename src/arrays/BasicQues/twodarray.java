package arrays.BasicQues;
import java.util.Arrays;
import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
       
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // output types:
        // 1st
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // 2nd enhaced for loop
        // for (int[] arr1 : arr) {
        //     for (int j = 0; j < arr1.length; j++) {
        //         System.out.print(arr1[j] + " ");
        //     }
        //     System.out.println();
        // }
        // 3rd by array library
        
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
    }
}
