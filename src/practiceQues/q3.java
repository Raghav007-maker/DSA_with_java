package src.practiceQues;
import java.util.*;
public class q3{
    public static int  Greater(int a,int b){
        if(a>b) return a;
        else return b;
    

    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int greater=Greater(a,b);
        System.out.print(greater);
        }
    }
}