package src.practiceQues;

import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.println(10+12/3*12+2%6);//60
        // System.out.println("Hello");
        // first one=new first("Raghav",48);
        // System.out.println(one.name);
        // System.out.println(one.roll_no);
        // System.out.println(-11%3);//-2 ,sign depends on numerator

        second two=new second(48, "Raghav", "Java");
        System.out.println(two.name);
        System.out.println(two.roll_no);
        System.out.println(two.subject);


    }
}
class first{
    int roll_no;
    String name;
    first(String name,int no){
        this.name=name;
        this.roll_no=no;
    }
}

class second extends first{
    String subject;
    second(int no,String name,String subject){
        super(name,no);
        this.subject = subject;
    }
}