package Recursion.BasicRecrssion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n=1432;
        int c=0;
        int ans=sumDigit(n,c);
        System.out.println(ans);
        int ans1=approch2(n);
        System.out.println(ans1);

    }
    public static int sumDigit(int n,int c){
        if(n==0) return c;
        c+=n%10;
        n/=10;
        return sumDigit(n,c);
    }
    public static int approch2(int n){
        if(n==0) return 0;

        return n%10+approch2(n/10);
    }
    
}
