package BasicOfJava;
import java.util.Scanner;
public class chardatatype {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        char ch;
        ch=sc.next().charAt(0);
        System.out.println(ch);
        }
    }
}
