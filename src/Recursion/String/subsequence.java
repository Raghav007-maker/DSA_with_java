package Recursion.String;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        subseq("","abc");
        ArrayList<String> list=ArrList("","abc");
        System.out.println(list);
    }

    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    // what if i want to add it in arraylists
    public static ArrayList<String> ArrList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

        ArrayList<String> left=ArrList(p+ch,up.substring(1));
        ArrayList<String> right=ArrList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
