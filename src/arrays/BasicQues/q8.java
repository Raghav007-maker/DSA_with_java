package arrays.BasicQues;
import java.util.Arrays;
import java.util.Scanner;
public class q8{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        // System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        }
    }
}