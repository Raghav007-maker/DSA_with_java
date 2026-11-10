package BasicOfJava.loops;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=Math.sqrt(no);i++){
            if(no%i==0){
                flag=true;
                break;
            }
        }
        if(no==1) System.out.println("neither prime nor composite");
        else if(flag==false) System.out.println("prime num");
        else System.out.println("Composite number");

    }
}
