package Patterns;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=m;j>=i;j--){
                if(i%2==0){
                    System.out.print(i+" ");
                }
                else System.out.print((char)(i+64)+" ");
            }System.out.println();
        }
                }
            }
        }
