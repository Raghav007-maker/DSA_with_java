package BasicOfJava.loops;


import java.util.Scanner;
public class basicQues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=1,inc=2;
        for(int i=1;i<=n;i++){
            System.out.print(no+" ");
            no=no*inc;
        }

    }
}
