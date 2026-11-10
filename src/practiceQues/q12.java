package src.practiceQues;

import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        prime(m,n);
    }
    public static void prime(int m,int n){
        for(int i=m;i<=n;i++){
            if(checkprime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkprime(int no){
        if(no<2) return false;
        else{
            for(int i=2;i<=Math.sqrt(no);i++){
                if(no%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
