package Recursion.Practice;

import java.util.ArrayList;

public class ascii {
    public static void main(String[] args) {
        System.out.println(ASCII("","abc"));
        
    }
    public static ArrayList<String> ASCII(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=ASCII(p+ch,up.substring(1));
        ArrayList<String> number=ASCII(p+(int)ch,up.substring(1));
        ArrayList<String> right=ASCII(p,up.substring(1));
        left.addAll(right);
        left.addAll(number);
        return left;

    }
}
