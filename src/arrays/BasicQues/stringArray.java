package arrays.BasicQues;
import java.util.Arrays;
import java.util.Scanner;
public class stringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String str[]=new String[size];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
