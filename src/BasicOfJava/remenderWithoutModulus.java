package BasicOfJava;
import java.util.Scanner;
public class remenderWithoutModulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no1;
        System.out.println("Enter first number");
        no1=sc.nextInt();
        int no2;
        System.out.println("Enter second number");
        no2=sc.nextInt();
       
        int q=(no1/no2);
        int rem = no1-no2*q;
        System.out.println(rem);
        

    }
}
