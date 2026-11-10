package Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next(); 
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        int st=0;
        int end=str.length()-1;
        while(end>=st){
            if(str.charAt(st)!=str.charAt(end)) return false;
            end--;
            st++;
        }
        return true;
    }
    // How To Convert An String To StringBuilder
  
}
