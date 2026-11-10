package src.practiceQues;
import java.util.*;
public class q8 {
    public static int power(double x,double n){
        int power=(int)Math.pow(x, n);
        return power;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int result=power(n,x);
        System.out.print(result);


        
    }    
}
