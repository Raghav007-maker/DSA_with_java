package Strings;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        String str="raghav";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        char arr[]=str.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(str.toUpperCase());
        
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        
        String name = "  Raghav bansal";
        String[] strArray = name.split(" ");
        System.out.println(Arrays.toString(strArray));

    }
}
