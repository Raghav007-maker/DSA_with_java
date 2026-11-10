package Recursion.Practice;

public class Fibo {
    public static void main(String[] args) {
        int ans=fibo(50);
        System.out.println(ans);
        
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1; 
        return fibo(n-1)+fibo(n-2);
    }
}

