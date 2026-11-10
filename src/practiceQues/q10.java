package src.practiceQues;
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no1=0,no2=1;
        if(n>=1) System.out.print(no1+" ");
        if(n>=2) System.out.print(no2+" ");
        for(int i=3;i<=n;i++){
            int no3=no1+no2;
            System.out.print(no3+" ");
            no1=no2;
            no2=no3;
        }


        
    }
}
