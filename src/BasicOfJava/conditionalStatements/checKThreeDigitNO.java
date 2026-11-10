package BasicOfJava.conditionalStatements;

import java.util.Scanner;

public class checKThreeDigitNO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if(no>99 && no<1000){
            System.out.println("THree Digit NUmber");
        }
        else{
            System.out.println("NOt A Three Digit No");
            
        }

    }
}
