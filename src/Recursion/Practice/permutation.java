package Recursion.Practice;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        Permutations("","abc");
        ArrayList<String> ans=permutationWithArrayList("","abc");
        System.out.println(ans);
    }

    public static void Permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            Permutations(f+ch+s,up.substring(1));
        }
    }

    public static ArrayList<String> permutationWithArrayList(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ArrayList<String> ansFromBelow=permutationWithArrayList(f+ch+s,up.substring(1));
            list.addAll(ansFromBelow);
        }
        return list;
    }
}
