package src.practiceQues;
import java.util.*;
public class q4{
    public static double  circum(int r){
        return 2*3.14*r;
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double circumference=circum(r);
        System.out.print(circumference);



        
    }
}