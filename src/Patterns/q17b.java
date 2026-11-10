package Patterns;

import java.util.Scanner;

public class q17b {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int n=sc.nextInt();
        int nsp=n-1,nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
                }
            }
        }
