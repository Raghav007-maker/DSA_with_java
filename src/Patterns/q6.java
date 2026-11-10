package Patterns;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=m;j>=i;j--){
                System.out.print("*");
            }System.out.println();
        }
        }    }
}