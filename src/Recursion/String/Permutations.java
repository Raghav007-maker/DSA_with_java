package Recursion.String;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");
        ArrayList<String> ans=permutationInArrayList("","abc");
        System.out.println(ans);
        int ans2=permutationcount("","abc");
            System.out.println(ans2);
        
    }
    public static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }
    // now if we want to return it as arrayList
    
    public static ArrayList<String> permutationInArrayList(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            ArrayList<String> a=permutationInArrayList(f+ch+s, up.substring(1));
            list.addAll(a);
        }
        return list;
    }

    public static int permutationcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            count+=permutationcount(f+ch+s, up.substring(1));
        }
        return count;
    }

}
