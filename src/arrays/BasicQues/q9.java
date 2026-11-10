package arrays.BasicQues;

import java.util.Arrays;
public class q9 {
    public static void main(String[] args) {
       
        String str="Raghav";
        char target='a';
        boolean ans =seachInString(str,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toCharArray());
    }
    public static boolean seachInString(String str,char target){
        if(str.length()==0) return false;
        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i)) return true;
        }
        return false;

    }

}
