package BasicOfJava;
import java.util.Scanner;
public class multiplyTwoNum {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int num1,num2,mul;
        System.out.println("enter first no");
        num1=sc.nextInt();
        System.out.println("enter second no");
        num2=sc.nextInt();
        mul=num1*num2;
        System.out.println("multiply of no is: "+mul);
        }
    }
   

}
