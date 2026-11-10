package src.practiceQues;
import java.util.*;
public class q5{
    public static String  vote(int age){
        String vote="";
        if(age>18) vote= "eligible to vote";
        else vote= "not eligible to vote";
        return vote;
    

    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int age=sc.nextInt();
        String vote=vote(age);
        System.out.print(vote);
        }
    }
}