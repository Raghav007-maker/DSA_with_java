package BasicOfJava.conditionalStatements;

import java.util.Scanner;
public class squareORNOt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        if(l==b){
            System.out.println("SQuare");
        }
        else{
            System.out.println("REctangle");
        }
        
    }
}
