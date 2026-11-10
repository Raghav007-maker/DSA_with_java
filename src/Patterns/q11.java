package Patterns;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==(x/2+1) || j==(x/2+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        }
    }
}
