package Recursion.String;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        ArrayList<String> list=dicelist("",4);
        System.out.println(list);
    }
    
    public static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    

    public static ArrayList<String> dicelist(String p,int target){
        if(target==0){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return  list;
        }
        ArrayList<String> list =new ArrayList<>();

        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(dicelist(p+i,target-i));
        }
        return list;
    }


    
}
