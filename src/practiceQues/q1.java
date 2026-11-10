package src.practiceQues;
import java.util.*;
public class q1{
    public static void avg(int num1,int num2,int num3){
        System.out.println((num1+num2+num3)/3);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        avg(num1,num2,num3);


        
    }
}