package src.practiceQues;
import java.util.*;
public class q2{
    public static int  odd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sumOdd=odd(no);
        System.out.print(sumOdd);



        
    }
}