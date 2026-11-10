package Recursion.BasicRecrssion;

public class reverse {
    public static void main(String[] args) {
        int n=12345;
        int rev=0;
        int ans=reverse1(n,rev);
        int ans1=reverse2(n,rev);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static int reverse1(int n,int rev){
        if(n==0) return rev;
        rev=rev*10+n%10;
        return reverse1(n/10,rev);
    }

    // approch 2
    public static int reverse2(int n,int rev){
        int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    public static int helper(int n,int digit){
        if(n%10==n) return n;

        int rev=n%10;
        return rev*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }


}
