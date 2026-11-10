package arrays.BasicQues;
import java.util.Scanner;
public class query {
    public static void main(String[] args) {
        int a=45;
        int b=23;
        sum(a,b);
        System.out.println(a);
    }
    static void sum(int m,int n){
        m=m+n;
    }
    // the value of a nd b will not get change as the java only pass parameter by value not pass by reference
    // but in array we pass reference to the arr which change lead to the change in original array
}
