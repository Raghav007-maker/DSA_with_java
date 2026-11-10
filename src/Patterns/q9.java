package Patterns;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int m=sc.nextInt();
        int no=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }System.out.println();
            
        }
        }    }
}