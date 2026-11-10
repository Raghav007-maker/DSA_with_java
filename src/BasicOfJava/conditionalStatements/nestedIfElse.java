package BasicOfJava.conditionalStatements;

import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ram=sc.nextInt();
        int shyam=sc.nextInt();
        int ajay=sc.nextInt();
        if(ram>shyam){
            if(ram>ajay){
                System.out.println("MAx AGe IS: "+ram);
            }
            else{
                if(ajay>shyam){
                    System.out.println("MAX AGE IS: "+ajay);
                }
                else{
                    System.out.println("MAX AGE IS: "+shyam);
                }
            }
        }
        else{
            if(shyam>ajay){
                System.out.println("MAX AGE IS:"+shyam);
            }
            else{
                System.out.println("MAX AGE IS: "+ajay);
            }
        }
    }
}
