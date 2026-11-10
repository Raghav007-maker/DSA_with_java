package BasicOfJava.Methods;
import java.util.*;
public class q3 {
    public static int factorial(int a){
        int fact=1;
        while(a>=1){
            fact=fact*a;
            a-=1;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
  
        int fact=factorial(a);
        System.out.print(fact);


    }
}
