package arrays.BasicQues;
import java.util.Scanner;
public class str_palindrome {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        String str=sc.next();
        boolean ans=check(str);
        System.out.println(ans);
        }
    }
     public static boolean check(String str){
        int st=0;
        int end=str.length()-1;
        while(end>st){
            if(str.charAt(st)!=str.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;

    }


}
