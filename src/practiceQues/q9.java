package src.practiceQues;
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gcd=1;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=Math.min(a, b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            } 
        }
        System.out.print(gcd);
    }
}
