package Recursion.BasicRecrssion;

public class CountZero {
    public static void main(String[] args) {
        int n=3040;
        int c=0;
        int ans=countzero(n,c);
        System.out.println(ans);
    }
    public static int countzero(int n,int  count){
        if(n==0) return count;
        if(n%10==0) count++;
        return countzero(n/10,count);
    }
   
}
