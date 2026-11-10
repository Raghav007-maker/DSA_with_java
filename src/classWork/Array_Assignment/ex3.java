package classWork.Array_Assignment;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {

        int[][] arr=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[3];

        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
