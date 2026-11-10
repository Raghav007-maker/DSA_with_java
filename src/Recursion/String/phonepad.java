package Recursion.String;

import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {
        phonePad("","12");
        ArrayList<String> list=phonePadList("","12");
        System.out.println(list);
        int ans=phonePadcount("","12");
        System.out.println(ans);
    }

    public static void phonePad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';

        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch=(char)('a'+i);

            phonePad(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> phonePadList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> List=new ArrayList<>();

        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch=(char)('a'+i);

            List.addAll(phonePadList(p+ch,up.substring(1)));
        }
        return List;
    }

    public static int phonePadcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit=up.charAt(0)-'0';
        int count=0;
        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch=(char)('a'+i);

            count+=phonePadcount(p+ch,up.substring(1));
        }
        return count;
    }
    
}
