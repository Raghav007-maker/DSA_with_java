package BasicOfJava.conditionalStatements;

import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if((no%5==0 ||no%3==0) && no%15!=0){
            System.out.println("number is not divisble by 15 ");
        }
        else{
            System.out.println("number is divisible by 15");
        }

        
    }
}
