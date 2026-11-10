package BasicOfJava.conditionalStatements;

import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        no=sc.nextInt();
        if(no%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

    }
}
