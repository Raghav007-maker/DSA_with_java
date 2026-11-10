package Recursion.BasicRecrssion;

public class print2 {
    public static void main(String[] args) {
        int n=5;
        recursion(n);
    }
    public static void recursion(int n){
        if(n==0) {
      
            return;
        }
        recursion(n-1);
        System.out.print(n+" ");
    }
}