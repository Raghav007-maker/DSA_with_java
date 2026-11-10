package arrays.BasicQues;
import java.util.Scanner;
public class maxWealth {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=findsum(arr);
        System.out.println(ans);
        }
    }
    static int findsum(int[][] arr){
        int maxSum=0;
        for(int row=0;row<arr.length;row++){
            int sum=0;
            for(int col=0;col<arr[row].length;col++){
                sum+=arr[row][col];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;

    }
}
