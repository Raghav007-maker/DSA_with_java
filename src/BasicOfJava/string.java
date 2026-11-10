package BasicOfJava;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char first, second;
       first = scanner.next().charAt(0);
       second = scanner.next().charAt(0);
       System.out.println(first + second);
       scanner.close();
    }
}