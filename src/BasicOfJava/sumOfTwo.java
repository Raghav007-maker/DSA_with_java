package BasicOfJava;
import java.util.Scanner;
public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first no: ");
        int num1=sc.nextInt();
        System.out.print("enter second no: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is: "+sum);
    }
}
