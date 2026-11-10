package arrays.BasicQues;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=sc.nextInt();
        int max=0;
        int sum=0;
        while(n==0){
            System.out.println("want to enter more no enter 0");
            n=sc.nextInt();
            if(no>max) max=no;
            if(n!=0) break;
            no=sc.nextInt();
        }
        System.out.println(max);
        
    }
}
